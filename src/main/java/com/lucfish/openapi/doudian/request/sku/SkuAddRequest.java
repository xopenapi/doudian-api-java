package com.lucfish.openapi.doudian.request.sku;

import com.lucfish.openapi.doudian.request.parameters.SkuAddParameters;
import com.lucfish.openapi.doudian.response.sku.SkuAddResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class SkuAddRequest extends TiktokOpenRequest<SkuAddParameters, SkuAddResponse> {

    public SkuAddRequest(SkuAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuAddResponse> getResponseType() {
        return SkuAddResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/add";
    }
}
