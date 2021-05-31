package io.github.xopenapi.doudian.request.product;

import io.github.xopenapi.doudian.request.parameters.ProductListParameters;
import io.github.xopenapi.doudian.response.product.ProductListResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
