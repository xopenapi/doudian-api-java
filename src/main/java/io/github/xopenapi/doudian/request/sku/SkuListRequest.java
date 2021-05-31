package io.github.xopenapi.doudian.request.sku;

import io.github.xopenapi.doudian.request.parameters.ProductIdParameter;
import io.github.xopenapi.doudian.response.sku.SkuListResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

public class SkuListRequest extends TiktokOpenRequest<ProductIdParameter, SkuListResponse> {


    public SkuListRequest(ProductIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuListResponse> getResponseType() {
        return SkuListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/list";
    }
}
