package io.github.xopenapi.doudian.request.parameters;

public class SkuDetailParameter {

    private String sku_id;

    public SkuDetailParameter(String sku_id) {
        this.sku_id = sku_id;

    }

    public String getSku_id() {
        return sku_id;
    }

    public void setSku_id(String sku_id) {
        this.sku_id = sku_id;
    }
}
