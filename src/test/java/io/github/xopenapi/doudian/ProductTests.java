package io.github.xopenapi.doudian;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.github.xopenapi.doudian.request.parameters.CidParameter;
import io.github.xopenapi.doudian.request.parameters.ProductListParameters;
import io.github.xopenapi.doudian.request.product.ProductGetGoodsCategoryRequest;
import io.github.xopenapi.doudian.request.product.ProductListRequest;
import org.junit.Before;
import org.junit.Test;
import io.github.xopenapi.doudian.response.product.ProductGetGoodsCategoryResponse;
import io.github.xopenapi.doudian.response.product.ProductListResponse;

public class ProductTests {

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
    public void productGetCategoryTest() {
        CidParameter cidParameter = new CidParameter(0L);
        ProductGetGoodsCategoryRequest request = new ProductGetGoodsCategoryRequest(cidParameter);
        ProductGetGoodsCategoryResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));

    }

    @Test
    public void addProduct() {

    }

    @Test
    public void getProductList() {
        ProductListParameters productListParameters = new ProductListParameters(1, 10);
        productListParameters.setStatus("1");
        productListParameters.setCheck_status("5");
        ProductListRequest request = new ProductListRequest(productListParameters);
        ProductListResponse response = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));
    }
}
