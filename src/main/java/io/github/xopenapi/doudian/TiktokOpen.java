package io.github.xopenapi.doudian;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.github.xopenapi.ErrNoHandleConfig;
import io.github.xopenapi.doudian.domain.AccessToken;
import io.github.xopenapi.doudian.exceptions.FailToRequestException;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;
import io.github.xopenapi.doudian.response.TiktokOpenResponse;
import io.github.xopenapi.doudian.utils.AssertUtils;
import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TiktokOpen {

    private Logger logger = LoggerFactory.getLogger(TiktokOpen.class);

    private TiktokOpenConfig tiktokOpenConfig;

    private DateTimeFormatter dateTimeFormatter;

    private ErrNoHandleConfig errNoHandleConfig;

    private HttpUtils httpUtils;

    public TiktokOpen(TiktokOpenConfig tiktokOpenConfig) {
        this.tiktokOpenConfig = tiktokOpenConfig;
        this.httpUtils = new HttpUtils(tiktokOpenConfig);
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public TiktokOpen(String appSecret, String appKey) {
        TiktokOpenConfig tiktokOpenConfig = new TiktokOpenConfig();
        tiktokOpenConfig.setAppsercet(appSecret);
        tiktokOpenConfig.setAppKey(appKey);

        this.tiktokOpenConfig = tiktokOpenConfig;
        this.httpUtils = new HttpUtils(tiktokOpenConfig);
        dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }

    public <S ,T extends TiktokOpenResponse<?>> T getTiktokResponse(TiktokOpenRequest<S ,T> request, String accessToken) {

        String jsonStr = JSON.toJSONString(request.getData(), SerializerFeature.MapSortField, SerializerFeature.WriteEnumUsingToString);
        // 不可包含特殊字符 & = ｜ ^ +
        AssertUtils.isTrue(!jsonStr.contains("&"), "不可包含特殊字符 & ");

        SortedMap<String, String> treeMap = new TreeMap<>();

        treeMap.put("param_json",
                jsonStr);
        if (logger.isInfoEnabled()) {
//            logger.info("抖音开发平台请求 {} {}",request.getMethod(), jsonStr);
        }

        treeMap.put("method", request.getMethod());
        treeMap.put("app_key", tiktokOpenConfig.getAppKey());
        treeMap.put("timestamp", dateTimeFormatter.format(LocalDateTime.now()));
        treeMap.put("v", request.getV());

        String sign = signStr(treeMap);
        treeMap.put("sign", sign);
        // access_token 不参与加密
        treeMap.put("access_token", accessToken);
        String url = tiktokOpenConfig.getHost() + request.getContentPath();
        // doGet 不处理 urlEncoder 所以要准备避免特殊字符
        // 修改为 doPost 方法，应该可以避免特殊字符影响
        String response = httpUtils.doPost(url , treeMap);

        /**
         * 请求异常则 response 会抛出异常 而不会是null
         */
        if (response != null) {
            try {
//                logger.info("抖音响应原始数据 msg:{}", response);
                T res = JSON.parseObject(response, request.getResponseType());
                if (logger.isInfoEnabled()) {
//                    logger.info("抖音开发平台响应 {}", JSON.toJSONString(res));
                }
                if (res.getErr_no() == 30006) {
                    // 用户取消授权
                    if (errNoHandleConfig.getAuthorize30006Handle() != null) {
                        errNoHandleConfig.getAuthorize30006Handle().accept(accessToken);
                    }
                }
                return res;
            } catch (Exception e) {
                logger.error("抖音响应解析失败 msg:{}", response);
                logger.error("抖音响应解析失败 error:{}", e);
//                return request.getResponseType().cast(new ErrorResponse());
//                T tiktokOpenResponse = new TiktokOpenResponse();
                throw new FailToRequestException(response, e);
            }
        }

        return null;
    }

    /**
     * 抖音签名方法
     * @param sortedMap
     * @return
     */
    private String signStr(SortedMap<String, String> sortedMap) {
        StringBuilder sb = new StringBuilder(tiktokOpenConfig.getAppsercet());
        sortedMap.forEach((key, value) -> {
            sb.append(key).append(value);
        });
        sb.append(tiktokOpenConfig.getAppsercet());
        return DigestUtils.md5Hex(sb.toString()).toLowerCase();
    }


    // 服务商
    public AccessToken getAccessToken(String code) {
        String url = tiktokOpenConfig.getHost();
        String uri = "/oauth2/access_token";

        Map<String, String> params = new HashMap<>();
        params.put("app_id", tiktokOpenConfig.getAppKey());
        params.put("app_secret", tiktokOpenConfig.getAppsercet());
        params.put("code", code);
        params.put("grant_type", "authorization_code");

        String response = httpUtils.doGet(url + uri, params);
        return JSON.parseObject(response, AccessToken.class);
    }

    // 自有型
    public AccessToken getAccessToken() {
        String url = tiktokOpenConfig.getHost();
        String uri = "/oauth2/access_token";

        Map<String, String> params = new HashMap<>();
        params.put("app_id", tiktokOpenConfig.getAppKey());
        params.put("app_secret", tiktokOpenConfig.getAppsercet());
        params.put("grant_type", "authorization_self");

        String response = httpUtils.doGet(url + uri, params);
        return JSON.parseObject(response, AccessToken.class);
    }

    public AccessToken refreshToken(String refreshToken) {
        String url = tiktokOpenConfig.getHost();
        String uri = "/oauth2/refresh_token";

        Map<String, String> params = new HashMap<>();
        params.put("app_id", tiktokOpenConfig.getAppKey());
        params.put("app_secret", tiktokOpenConfig.getAppsercet());
        params.put("refresh_token", refreshToken);
        params.put("grant_type", "refresh_token");

        String response = httpUtils.doGet(url + uri, params);
        return JSON.parseObject(response, AccessToken.class);
    }

    /**
     * 检查是否有特殊字符
     * @return
     */
    public static boolean hasSpecialChar(String content) {
        // 不可包含特殊字符 & = ｜ ^ +
        int len = content.length();
        char[] chars = new char[]{'&', '|', '^'};
        for (int i = 0; i < len; i++) {
            char s = content.charAt(i);
            for (char aChar : chars) {
                if (s == aChar) {
                    return true;
                }
            }
        }
        return false;
    }

    public ErrNoHandleConfig getErrNoHandleConfig() {
        return errNoHandleConfig;
    }

    public void setErrNoHandleConfig(ErrNoHandleConfig errNoHandleConfig) {
        this.errNoHandleConfig = errNoHandleConfig;
    }
}
