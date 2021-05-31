package io.github.xopenapi.doudian.request.product;

import io.github.xopenapi.doudian.request.parameters.ProductDetailParameter;
import io.github.xopenapi.doudian.response.product.ProductDetailResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
