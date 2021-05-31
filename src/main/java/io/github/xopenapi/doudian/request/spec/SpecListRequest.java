package io.github.xopenapi.doudian.request.spec;

import io.github.xopenapi.doudian.request.parameters.NoParameters;
import io.github.xopenapi.doudian.response.spec.SpecListResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
