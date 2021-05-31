package io.github.xopenapi.doudian.request.sku;

import io.github.xopenapi.doudian.request.parameters.SkuPriceParameters;
import io.github.xopenapi.doudian.response.sku.SkuEditPriceResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

public class SkuEditPriceRequest extends TiktokOpenRequest<SkuPriceParameters, SkuEditPriceResponse> {

    public SkuEditPriceRequest(SkuPriceParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuEditPriceResponse> getResponseType() {
        return SkuEditPriceResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/editPrice";
    }
}
