package io.github.xopenapi.doudian.request.spec;

import io.github.xopenapi.doudian.request.parameters.SpecAddParameters;
import io.github.xopenapi.doudian.response.spec.SpecAddResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;


/**
 * 添加规格
 */
public class SpecAddRequest extends TiktokOpenRequest<SpecAddParameters, SpecAddResponse> {

    public SpecAddRequest(SpecAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SpecAddResponse> getResponseType() {
        return SpecAddResponse.class;
    }


    @Override
    public String getContentPath() {
        return "/spec/add";
    }
}
