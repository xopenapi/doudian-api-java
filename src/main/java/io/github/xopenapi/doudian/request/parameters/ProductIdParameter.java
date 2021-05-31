package io.github.xopenapi.doudian.request.parameters;

import io.github.xopenapi.doudian.utils.AssertUtils;

import java.util.Objects;

public class ProductIdParameter {

    private Long product_id;
    private Long out_product_id;

    public ProductIdParameter(Long productId) {
        AssertUtils.isTrue( (productId != null)
                || (productId == null), "商品id，和接入方的out_product_id二选一");

        this.product_id = productId;
    }

    public String getProduct_id() {
        return Objects.toString(product_id, null);
    }

    public String getOut_product_id() {
        return Objects.toString(out_product_id, null);
    }
}
