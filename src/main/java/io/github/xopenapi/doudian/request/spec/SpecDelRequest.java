package io.github.xopenapi.doudian.request.spec;

import io.github.xopenapi.doudian.request.parameters.IDParameter;
import io.github.xopenapi.doudian.response.spec.SpecDelResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

/**
 * 删除规格
 * 注意 : 删除spec后将导致原有绑定该spec的sku全部失效, 请慎重操作
 */
public class SpecDelRequest extends TiktokOpenRequest<IDParameter, SpecDelResponse> {

    public SpecDelRequest(IDParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<SpecDelResponse> getResponseType() {
        return SpecDelResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/spec/del";
    }
}
