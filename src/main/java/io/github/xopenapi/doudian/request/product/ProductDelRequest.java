package io.github.xopenapi.doudian.request.product;

import io.github.xopenapi.doudian.request.parameters.ProductIdParameter;
import io.github.xopenapi.doudian.response.product.ProductDelResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
