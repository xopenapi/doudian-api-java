package com.lucfish.openapi.doudian.request.spec;

import com.lucfish.openapi.doudian.request.parameters.NoParameters;
import com.lucfish.openapi.doudian.response.spec.SpecListResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

/**、
 * 获取规格列表
 */
public class SpecListRequest extends TiktokOpenRequest<NoParameters, SpecListResponse> {

    public SpecListRequest() {
        super(NoParameters.getInstance());
    }

    @Override
    public Class<SpecListResponse> getResponseType() {
        return SpecListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/spec/list";
    }
}
