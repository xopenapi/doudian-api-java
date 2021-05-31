package com.lucfish.openapi.doudian.request.product;

import com.lucfish.openapi.doudian.request.parameters.ProductAddParameters;
import com.lucfish.openapi.doudian.response.product.ProductAddResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class ProductAddRequest extends TiktokOpenRequest<ProductAddParameters, ProductAddResponse> {

    public ProductAddRequest(ProductAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductAddResponse> getResponseType() {
        return ProductAddResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/add";
    }
}
