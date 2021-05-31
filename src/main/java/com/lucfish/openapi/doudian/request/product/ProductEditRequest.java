package com.lucfish.openapi.doudian.request.product;

import com.lucfish.openapi.doudian.request.parameters.ProductEditParameters;
import com.lucfish.openapi.doudian.response.product.ProductEditResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class ProductEditRequest extends TiktokOpenRequest<ProductEditParameters, ProductEditResponse> {

    public ProductEditRequest(ProductEditParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductEditResponse> getResponseType() {
        return ProductEditResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/product/edit";
    }
}
