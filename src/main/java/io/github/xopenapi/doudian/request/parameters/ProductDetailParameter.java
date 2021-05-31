package io.github.xopenapi.doudian.request.parameters;

import io.github.xopenapi.doudian.utils.AssertUtils;

import java.util.Objects;

public class ProductDetailParameter {

    private Long product_id;
    private Boolean show_draft;

    public ProductDetailParameter(Long productId, Boolean show_draft) {
        AssertUtils.isTrue( (productId != null)
                || (productId == null), "商品id，和接入方的out_product_id二选一");

        this.product_id = productId;
        if(show_draft != null){
            this.show_draft = show_draft;
        }
    }

    public String getProduct_id() {
        return Objects.toString(product_id, null);
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Boolean getShow_draft() {
        return show_draft;
    }

    public void setShow_draft(Boolean show_draft) {
        this.show_draft = show_draft;
    }
}
