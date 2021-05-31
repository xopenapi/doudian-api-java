package com.lucfish.openapi.doudian.request.parameters;

import com.alibaba.fastjson.annotation.JSONField;
import com.lucfish.openapi.doudian.domain.Product;
import com.lucfish.openapi.doudian.domain.enums.PayType;
import com.lucfish.openapi.doudian.domain.enums.PresellType;
import com.lucfish.openapi.doudian.utils.Join;

import java.time.LocalDateTime;

public class ProductAddParameters {
    /**
     * 外部商品id,接入方的商品id (需为数字字符串, max = int64)
     */
    private String out_product_id;

    private String name;

    /**
     * 商品轮播图
     */
    private String pic;

    /**
     * 商品描述图
     */
    private String description;

    /**
     * 市场价，单位分
     */
    private String market_price;

    /**
     * 售卖价，单位分
     */
    private String discount_price;

    /**
     * 一级分类id
     * (三个分类级别请确保从属正确)
     */
    private String first_cid;

    /**
     * 二级分类id
     * (三个分类级别请确保从属正确)
     */
    private String second_cid;

    /**
     * 三级分类id
     * (三个分类级别请确保从属正确)
     */
    private String third_cid;
    /**
     * 规格id, 要先创建商品通用规格, 如颜色-尺寸
     */
    private String spec_id;

    private String spec_pic;

    /**
     * 客服号码
     */
    private String mobile;

    /**
     * 商品重量 (单位:克)
     * 范围: 10克 - 9999990克
     */
    private String weight;

    /**
     * 属性名称|属性值
     */
    private String product_format;

    // 支持的支付方式：0货到付款 1在线支付 2两者都支持
    private PayType pay_type;

    /**
     * 商家推荐语 可选
     */
    private String recommend_remark;

    /**
     * 品牌id (请求店铺授权品牌接口获取) (效果即为商品详情页面中的品牌字段)
     * 可选
     */
    private String brand_id;
    /**
     * 可选
     */
    private PresellType presell_type;

    /**
     * 预售结束后，几天发货，可以选择2-30 可选
     */
    private String presell_delay;
    /**
     * 预售结束时间，格式2020-02-21 18:54:27，最多支持设置距离当前30天 可选
     */
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime presell_end_time;

    /**
     * 承诺发货时间 可选值为: 2、3、5、7、10、15 可选
     */
    private String delivery_delay_day;

    /**
    * 商品创建和编辑操作支持设置质检报告链接,多个图片以逗号分隔
    */
    private String quantity_report;
    /**
    * 商品创建和编辑操作支持设置品类资质链接,多个图片以逗号分隔
    */
    private String class_quantity;



    public ProductAddParameters(Product product) {
        this.name = product.getName();

//        AssertUtils.isTrue(CollectionUtils.isPresent(product.getPic()), "商品轮播图 不能为空");
        this.pic = product.getPic().stream()
                .collect(Join.VERTICAL);

//        AssertUtils.isTrue(CollectionUtils.isPresent(product.getDescription()), "商品描述 不能为空");
//        this.description = product.getDescriptionUrl().stream()
//                .collect(Join.VERTICAL);

        this.out_product_id = product.getOut_product_id().toString();

        this.market_price = product.getMarket_price().toString();
        this.discount_price = product.getDiscount_price().toString();

        this.first_cid = product.getFirst_cid().toString();
        this.second_cid = product.getSecond_cid().toString();
        this.third_cid = product.getThird_cid().toString();

        this.pay_type = product.getPay_type();
        this.spec_id = product.getSpec_id().toString();

        if (product.getSpec_pics() != null
                && product.getSpec_pics().size() > 0) {
            this.spec_pic = product.getSpec_pics().stream()
                    .map(pic -> pic.getSpec_detail_id() + "|" + pic.getPic())
                    .collect(Join.UPUP);
        }

        this.mobile = product.getMobile();
//        this.weight = product.getWeight().toString();

//        this.product_format = Join.kvJoin(product.getProduct_format());

        this.recommend_remark = product.getRecommend_remark();
//
//        this.brand_id = Objects.toString(product.getBrand_id(), null);
//        this.presell_type = product.getPresell_type();
//        this.presell_delay = Objects.toString(product.getPresell_delay(), null);
//
//        this.presell_end_time = product.getPresell_end_time();
//        this.delivery_delay_day = Objects.toString(product.getDelivery_delay_day(), null) ;
    }


    public String getOut_product_id() {
        return out_product_id;
    }

    public void setOut_product_id(String out_product_id) {
        this.out_product_id = out_product_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMarket_price() {
        return market_price;
    }

    public void setMarket_price(String market_price) {
        this.market_price = market_price;
    }

    public String getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(String discount_price) {
        this.discount_price = discount_price;
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

    public String getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(String spec_id) {
        this.spec_id = spec_id;
    }

    public String getSpec_pic() {
        return spec_pic;
    }

    public void setSpec_pic(String spec_pic) {
        this.spec_pic = spec_pic;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getProduct_format() {
        return product_format;
    }

    public void setProduct_format(String product_format) {
        this.product_format = product_format;
    }

    public PayType getPay_type() {
        return pay_type;
    }

    public void setPay_type(PayType pay_type) {
        this.pay_type = pay_type;
    }

    public String getRecommend_remark() {
        return recommend_remark;
    }

    public void setRecommend_remark(String recommend_remark) {
        this.recommend_remark = recommend_remark;
    }

    public String getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(String brand_id) {
        this.brand_id = brand_id;
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

    public LocalDateTime getPresell_end_time() {
        return presell_end_time;
    }

    public void setPresell_end_time(LocalDateTime presell_end_time) {
        this.presell_end_time = presell_end_time;
    }

    public String getDelivery_delay_day() {
        return delivery_delay_day;
    }

    public void setDelivery_delay_day(String delivery_delay_day) {
        this.delivery_delay_day = delivery_delay_day;
    }

    public String getQuantity_report() {
        return quantity_report;
    }

    public void setQuantity_report(String quantity_report) {
        this.quantity_report = quantity_report;
    }

    public String getClass_quantity() {
        return class_quantity;
    }

    public void setClass_quantity(String class_quantity) {
        this.class_quantity = class_quantity;
    }
}
