package io.github.xopenapi.doudian.request.sku;

import io.github.xopenapi.doudian.request.parameters.SkuAddAllParameters;
import io.github.xopenapi.doudian.response.sku.SkuAddAllResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

public class SkuAddAllRequest extends TiktokOpenRequest<SkuAddAllParameters, SkuAddAllResponse> {

    public SkuAddAllRequest(SkuAddAllParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuAddAllResponse> getResponseType() {
        return SkuAddAllResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/addAll";
    }
}
