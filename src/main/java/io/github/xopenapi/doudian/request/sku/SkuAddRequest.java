package io.github.xopenapi.doudian.request.sku;

import io.github.xopenapi.doudian.request.parameters.SkuAddParameters;
import io.github.xopenapi.doudian.response.sku.SkuAddResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

public class SkuAddRequest extends TiktokOpenRequest<SkuAddParameters, SkuAddResponse> {

    public SkuAddRequest(SkuAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuAddResponse> getResponseType() {
        return SkuAddResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/add";
    }
}
