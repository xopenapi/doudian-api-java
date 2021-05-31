package io.github.xopenapi.doudian.request.spec;

import io.github.xopenapi.doudian.request.parameters.IDParameter;
import io.github.xopenapi.doudian.response.spec.SpecSpecDetailResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
