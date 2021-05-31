package io.github.xopenapi.doudian.request.parameters;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.xopenapi.doudian.domain.Product;
import io.github.xopenapi.doudian.domain.enums.PresellType;
import io.github.xopenapi.doudian.utils.AssertUtils;
import io.github.xopenapi.doudian.utils.CollectionUtils;
import io.github.xopenapi.doudian.utils.Join;

import java.time.LocalDateTime;
import java.util.Objects;

public class ProductEditParameters {

    /**
     * 产品ID， 三方ID， 二选一
     */
    private String product_id;

    /**
     * 可选
     */
    private String name;
    /**
     * 规格id, 要先创建商品通用规格, 如颜色-尺寸 可选
     */
    private String spec_id;
    /**
     * 商品轮播图 可选
     */
    private String pic;

    /**
     * 商品描述图 可选
     */
    private String description;

    /**
     * 一级分类id 可选
     * (三个分类级别请确保从属正确)
     */
    private String first_cid;

    /**
     * 二级分类id 可选
     * (三个分类级别请确保从属正确)
     */
    private String second_cid;

    /**
     * 三级分类id 可选
     * (三个分类级别请确保从属正确)
     */
    private String third_cid;

    /**
     * 客服号码 可选
     */
    private String mobile;

    /**
     * 属性名称|属性值 可选
     */
    private String product_format;

    /**
     * 可选
     */
    private PresellType presell_type;

    /**
     * 预售结束后，几天发货，可以选择2-30 可选
     */
    private String presell_delay;

    /*
    * "1"：编辑后立即提交审核；"2"：编辑后仅保存，不提审
    * */
    private String commit;

    /**
     * 预售结束时间，格式2020-02-21 18:54:27，最多支持设置距离当前30天 可选
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime presell_end_time;

    public ProductEditParameters(Product product) {
        Long productId = product.getProduct_id();
        Long outProductId = product.getOut_product_id();
        AssertUtils.isTrue( (productId != null && outProductId == null)
            || (productId == null && outProductId != null), "商品id，和接入方的out_product_id二选一");

        this.product_id = Objects.toString(productId, null);

        this.name = product.getName();

//        AssertUtils.isTrue(CollectionUtils.isPresent(product.getPic()), "商品轮播图 不能为空");
        if (CollectionUtils.isPresent(product.getPic())) {
            this.pic = product.getPic().stream()
                    .collect(Join.VERTICAL);
        }

//
//        if (CollectionUtils.isPresent(product.getDescriptionUrl())) {
//            this.description = product.getDescriptionUrl().stream()
//                    .collect(Join.VERTICAL);
//        }

        if (product.getFirst_cid() != null) {
            this.first_cid = product.getFirst_cid().toString();
            this.second_cid = product.getSecond_cid().toString();
            this.third_cid = product.getThird_cid().toString();
        }


        this.spec_id = Objects.toString(product.getSpec_id(), null);

        this.mobile = product.getMobile();
//
//        if (product.getProduct_format() != null ) {
//            this.product_format = Join.kvJoin(product.getProduct_format());
//        }

        this.presell_type = product.getPresell_type();
//        this.presell_delay = Objects.toString(product.getPresell_delay(), null);
//        this.presell_end_time = product.getPresell_end_time();

    }

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(String spec_id) {
        this.spec_id = spec_id;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFirst_cid() {
        return first_cid;
    }

    public void setFirst_cid(String first_cid) {
        this.first_cid = first_cid;
    }

    public String getSecond_cid() {
        return second_cid;
    }

    public void setSecond_cid(String second_cid) {
        this.second_cid = second_cid;
    }

    public String getThird_cid() {
        return third_cid;
    }

    public void setThird_cid(String third_cid) {
        this.third_cid = third_cid;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getProduct_format() {
        return product_format;
    }

    public void setProduct_format(String product_format) {
        this.product_format = product_format;
    }

    public PresellType getPresell_type() {
        return presell_type;
    }

    public void setPresell_type(PresellType presell_type) {
        this.presell_type = presell_type;
    }

    public String getPresell_delay() {
        return presell_delay;
    }

    public void setPresell_delay(String presell_delay) {
        this.presell_delay = presell_delay;
    }

    public String getCommit() {
        return commit;
    }

    public void setCommit(String commit) {
        this.commit = commit;
    }

    public LocalDateTime getPresell_end_time() {
        return presell_end_time;
    }

    public void setPresell_end_time(LocalDateTime presell_end_time) {
        this.presell_end_time = presell_end_time;
    }
}
