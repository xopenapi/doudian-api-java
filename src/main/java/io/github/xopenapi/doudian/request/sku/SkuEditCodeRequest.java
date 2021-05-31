package io.github.xopenapi.doudian.request.sku;

import io.github.xopenapi.doudian.request.parameters.SkuCodeParameters;
import io.github.xopenapi.doudian.response.sku.SkuEditCodeResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
