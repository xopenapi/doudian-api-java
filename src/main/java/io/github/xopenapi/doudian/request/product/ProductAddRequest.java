package io.github.xopenapi.doudian.request.product;

import io.github.xopenapi.doudian.request.parameters.ProductAddParameters;
import io.github.xopenapi.doudian.response.product.ProductAddResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
