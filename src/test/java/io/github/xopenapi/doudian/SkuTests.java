package io.github.xopenapi.doudian;

import org.junit.Before;
import org.junit.Test;

public class SkuTests {
    private TiktokOpen client;

    private String accessToken;

    @Before
    public void before() {

        TiktokOpenConfig config = new TiktokOpenConfig();
        config.setAppsercet(AppInfo.appSecret);
        config.setAppKey(AppInfo.appKey);
        TiktokOpen open = new TiktokOpen(config);
        this.client = open;
        this.accessToken = AppInfo.accessToken;
    }

    @Test
    public void skuAddAll() {

//        SkuAddAllParameters parameter = new SkuAddAllParameters(1100L, new ArrayList<>());
//        SkuAddAllParameters parameter = new SkuAddAllParameters(1100L, new ArrayList<>());
//
//        SkuAddAllRequest request = new SkuAddAllRequest(parameter);
//        SkuAddAllResponse response = client.getTiktokResponse(request, accessToken);
//        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));
    }
}
