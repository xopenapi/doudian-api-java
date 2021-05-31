package com.lucfish.openapi.doudian.request.sku;

import com.lucfish.openapi.doudian.request.TiktokOpenRequest;
import com.lucfish.openapi.doudian.request.parameters.SkuDetailParameter;
import com.lucfish.openapi.doudian.response.sku.SkuDetailResponse;

public class SkuDetailRequest extends TiktokOpenRequest<SkuDetailParameter, SkuDetailResponse> {
    public SkuDetailRequest(SkuDetailParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuDetailResponse> getResponseType() {
        return SkuDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/detail";
    }
}
