package com.lucfish.openapi.doudian.request.sku;

import com.lucfish.openapi.doudian.request.parameters.SkuAddAllParameters;
import com.lucfish.openapi.doudian.response.sku.SkuAddAllResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class SkuAddAllRequest extends TiktokOpenRequest<SkuAddAllParameters, SkuAddAllResponse> {

    public SkuAddAllRequest(SkuAddAllParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuAddAllResponse> getResponseType() {
        return SkuAddAllResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/addAll";
    }
}
