package io.github.xopenapi.doudian.request.product;

import io.github.xopenapi.doudian.request.parameters.ProductCatePropertyParameter;
import io.github.xopenapi.doudian.response.product.ProductGetCategoryPropertyResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

/**
 * 获取商品分类列表
 */
public class ProductGetCategoryPropertyRequest extends TiktokOpenRequest<ProductCatePropertyParameter, ProductGetCategoryPropertyResponse> {

    public ProductGetCategoryPropertyRequest(ProductCatePropertyParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductGetCategoryPropertyResponse> getResponseType() {
        return ProductGetCategoryPropertyResponse.class;
    }


    @Override
    public String getContentPath() {
        return "/product/getCateProperty";
    }
}
