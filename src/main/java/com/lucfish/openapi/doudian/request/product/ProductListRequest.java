package com.lucfish.openapi.doudian.request.product;

import com.lucfish.openapi.doudian.request.parameters.ProductListParameters;
import com.lucfish.openapi.doudian.response.product.ProductListResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class ProductListRequest extends TiktokOpenRequest<ProductListParameters, ProductListResponse> {

    public ProductListRequest(ProductListParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductListResponse> getResponseType() {
        return ProductListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/list";
    }
}
