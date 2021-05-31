package io.github.xopenapi.doudian;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.github.xopenapi.doudian.domain.AccessToken;
import org.junit.Before;
import org.junit.Test;

public class TokenTests {

    private TiktokOpen client;

    private String accessToken;

    @Before
    public void before() {
        TiktokOpen open = new TiktokOpen(AppInfo.appSecret, AppInfo.appKey);
        this.client = open;
        this.accessToken = AppInfo.accessToken;
    }

    @Test
    public void getToken() {

        AccessToken response = client.getAccessToken();

        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));


    }



}
