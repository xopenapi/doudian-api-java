package com.lucfish.openapi.doudian.request.sku;

import com.lucfish.openapi.doudian.request.parameters.SkuCodeParameters;
import com.lucfish.openapi.doudian.response.sku.SkuEditCodeResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class SkuEditCodeRequest extends TiktokOpenRequest<SkuCodeParameters, SkuEditCodeResponse> {

    public SkuEditCodeRequest(SkuCodeParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuEditCodeResponse> getResponseType() {
        return SkuEditCodeResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/editCode";
    }
}
