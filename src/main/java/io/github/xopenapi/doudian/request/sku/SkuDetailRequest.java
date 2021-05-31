package io.github.xopenapi.doudian.request.sku;

import io.github.xopenapi.doudian.request.TiktokOpenRequest;
import io.github.xopenapi.doudian.request.parameters.SkuDetailParameter;
import io.github.xopenapi.doudian.response.sku.SkuDetailResponse;

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
