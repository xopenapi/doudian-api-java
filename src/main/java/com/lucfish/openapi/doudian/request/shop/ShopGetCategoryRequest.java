package com.lucfish.openapi.doudian.request.shop;

import com.lucfish.openapi.doudian.request.TiktokOpenRequest;
import com.lucfish.openapi.doudian.request.parameters.CidParameter;
import com.lucfish.openapi.doudian.response.shop.ShopGetCategoryResponse;

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
