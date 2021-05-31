package com.lucfish.openapi.doudian.request.product;

import com.lucfish.openapi.doudian.request.parameters.CidParameter;
import com.lucfish.openapi.doudian.response.product.ProductGetGoodsCategoryResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

/**
 * 获取商品分类列表
 */
public class ProductGetGoodsCategoryRequest extends TiktokOpenRequest<CidParameter, ProductGetGoodsCategoryResponse> {

    public ProductGetGoodsCategoryRequest(CidParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductGetGoodsCategoryResponse> getResponseType() {
        return ProductGetGoodsCategoryResponse.class;
    }


    @Override
    public String getContentPath() {
        return "/product/getGoodsCategory";
    }
}
