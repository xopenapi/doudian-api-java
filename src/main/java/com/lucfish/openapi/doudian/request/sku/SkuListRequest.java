package com.lucfish.openapi.doudian.request.sku;

import com.lucfish.openapi.doudian.request.parameters.ProductIdParameter;
import com.lucfish.openapi.doudian.response.sku.SkuListResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

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
