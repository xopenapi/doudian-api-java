package com.lucfish.openapi.doudian.request.product;

import com.lucfish.openapi.doudian.request.parameters.ProductIdParameter;
import com.lucfish.openapi.doudian.response.product.ProductDelResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class ProductDelRequest extends TiktokOpenRequest<ProductIdParameter, ProductDelResponse> {

    public ProductDelRequest(ProductIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductDelResponse> getResponseType() {
        return ProductDelResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/del";
    }
}
