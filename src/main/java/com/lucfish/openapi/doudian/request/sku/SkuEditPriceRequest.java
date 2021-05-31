package com.lucfish.openapi.doudian.request.sku;

import com.lucfish.openapi.doudian.request.parameters.SkuPriceParameters;
import com.lucfish.openapi.doudian.response.sku.SkuEditPriceResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

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
