package com.lucfish.openapi.doudian.request.product;

import com.lucfish.openapi.doudian.request.parameters.ProductCatePropertyParameter;
import com.lucfish.openapi.doudian.response.product.ProductGetCategoryPropertyResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

/**
 * 获取商品分类列表
 */
public class ProductGetCategoryPropertyRequest extends TiktokOpenRequest<ProductCatePropertyParameter, ProductGetCategoryPropertyResponse> {

    public ProductGetCategoryPropertyRequest(ProductCatePropertyParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductGetCategoryPropertyResponse> getResponseType() {
        return ProductGetCategoryPropertyResponse.class;
    }


    @Override
    public String getContentPath() {
        return "/product/getCateProperty";
    }
}
