package io.github.xopenapi.doudian.request.sku;

import io.github.xopenapi.doudian.request.parameters.SkuStockParameters;
import io.github.xopenapi.doudian.response.sku.SkuSyncStockResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
