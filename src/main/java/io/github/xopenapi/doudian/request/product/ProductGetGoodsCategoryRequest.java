package io.github.xopenapi.doudian.request.product;

import io.github.xopenapi.doudian.request.parameters.CidParameter;
import io.github.xopenapi.doudian.response.product.ProductGetGoodsCategoryResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

/**
 * 获取商品分类列表
 */
public class ProductGetGoodsCategoryRequest extends TiktokOpenRequest<CidParameter, ProductGetGoodsCategoryResponse> {

    public ProductGetGoodsCategoryRequest(CidParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<ProductGetGoodsCategoryResponse> getResponseType() {
        return ProductGetGoodsCategoryResponse.class;
    }


    @Override
    public String getContentPath() {
        return "/product/getGoodsCategory";
    }
}
