package io.github.xopenapi.doudian.request.shop;

import io.github.xopenapi.doudian.request.TiktokOpenRequest;
import io.github.xopenapi.doudian.request.parameters.CidParameter;
import io.github.xopenapi.doudian.response.shop.ShopGetCategoryResponse;

/**
 * 获取店铺分类列表
 */
public class ShopGetCategoryRequest extends TiktokOpenRequest<CidParameter, ShopGetCategoryResponse> {

    public ShopGetCategoryRequest(CidParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ShopGetCategoryResponse> getResponseType() {
        return ShopGetCategoryResponse.class;
    }


    @Override
    public String getContentPath() {
        return "/shop/getShopCategory";
    }
}
