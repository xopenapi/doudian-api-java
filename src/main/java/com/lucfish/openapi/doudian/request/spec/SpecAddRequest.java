package com.lucfish.openapi.doudian.request.spec;

import com.lucfish.openapi.doudian.request.parameters.SpecAddParameters;
import com.lucfish.openapi.doudian.response.spec.SpecAddResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;


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
