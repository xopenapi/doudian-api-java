package com.lucfish.openapi.doudian.request.product;

import com.lucfish.openapi.doudian.request.parameters.ProductDetailParameter;
import com.lucfish.openapi.doudian.response.product.ProductDetailResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class ProductDetailRequest extends TiktokOpenRequest<ProductDetailParameter, ProductDetailResponse> {
    public ProductDetailRequest(ProductDetailParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductDetailResponse> getResponseType() {
        return ProductDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/detail";
    }
}
