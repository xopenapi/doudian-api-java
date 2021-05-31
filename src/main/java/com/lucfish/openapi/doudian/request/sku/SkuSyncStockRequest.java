package com.lucfish.openapi.doudian.request.sku;

import com.lucfish.openapi.doudian.request.parameters.SkuStockParameters;
import com.lucfish.openapi.doudian.response.sku.SkuSyncStockResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class SkuSyncStockRequest extends TiktokOpenRequest<SkuStockParameters, SkuSyncStockResponse> {

    public SkuSyncStockRequest(SkuStockParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<SkuSyncStockResponse> getResponseType() {
        return SkuSyncStockResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/sku/syncStock";
    }
}
