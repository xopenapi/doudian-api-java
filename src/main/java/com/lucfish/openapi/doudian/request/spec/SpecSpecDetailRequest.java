package com.lucfish.openapi.doudian.request.spec;

import com.lucfish.openapi.doudian.request.parameters.IDParameter;
import com.lucfish.openapi.doudian.response.spec.SpecSpecDetailResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

/**
 * 查看规格详细
 */
public class SpecSpecDetailRequest extends TiktokOpenRequest<IDParameter, SpecSpecDetailResponse> {

    public SpecSpecDetailRequest(IDParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<SpecSpecDetailResponse> getResponseType() {
        return SpecSpecDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/spec/specDetail";
    }
}
