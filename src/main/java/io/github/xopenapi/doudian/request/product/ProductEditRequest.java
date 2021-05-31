package io.github.xopenapi.doudian.request.product;

import io.github.xopenapi.doudian.request.parameters.ProductEditParameters;
import io.github.xopenapi.doudian.response.product.ProductEditResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
