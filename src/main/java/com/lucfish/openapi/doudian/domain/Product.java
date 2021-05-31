package com.lucfish.openapi.doudian.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.lucfish.openapi.doudian.domain.enums.CheckStatus;
import com.lucfish.openapi.doudian.domain.enums.PayType;
import com.lucfish.openapi.doudian.domain.enums.PresellType;
import com.lucfish.openapi.doudian.domain.enums.ProductStatus;

import java.util.List;

public class Product {

    private Long product_id;
    // 没有意义的字段 通产品ID一致
    @JSONField(serialize = false, deserialize = false)
    private String product_id_str;
    //外部商品id,接入方的商品id (需为数字字符串, max = int64)
    private Long out_product_id;
    private String name;
    //抖音小店的description
//    @JSONField(deserialize = false)
    private String description;
    //市场价，单位分
    private Integer market_price;
    //售卖价，单位分
    private Integer discount_price;
    // 0上架 1下架 2已删除
    private ProductStatus status;
    //规格id, 要先创建商品通用规格, 如颜色-尺寸
    private Long spec_id;
    // 商品审核状态 1未提审 2审核中 3审核通过 4审核驳回 5封禁
    private CheckStatus check_status;
    //客服号码
    private String mobile;
    // 一级分类id, (三个分类级别请确保从属正确)
    private Long first_cid;
    // 二级分类id, (三个分类级别请确保从属正确)
    private Long second_cid;
    // 三级分类id, (三个分类级别请确保从属正确)
    private Long third_cid;
    // 支持的支付方式：0货到付款 1在线支付 2两者都支持
    private PayType pay_type;
    // 商家推荐语
    private String recommend_remark;
    // 预售类型，1-全款预售，0-非预售，2-阶梯库存
    private PresellType presell_type;
    // 额外信息
    private String extra;
//    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String create_time;
//    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private String update_time;
    // 商品主图
    private List<String> pic;
    // 属性名称|属性值 之间用|分隔, 多组之间用^分开
//    private Map<String, String> product_format;
    // 规格图片
    private List<SpecPic> spec_pics;
    // sku详情，其中 id，规格id，spec_id，规格组id
    private List<SpecPrice> spec_prices;
    private List<Spec> specs;
    // 头图，主图第一张
    private String img;
    // 新类目的详情
    private CategoryDetail category_detail;
    private Integer maximum_per_order;
    private Integer limit_per_buyer;
    private Integer minimum_per_order;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPic() {
        return pic;
    }

    public void setPic(List<String> pic) {
        this.pic = pic;
    }

    public Long getOut_product_id() {
        return out_product_id;
    }

    public void setOut_product_id(Long out_product_id) {
        this.out_product_id = out_product_id;
    }

    public Integer getMarket_price() {
        return market_price;
    }

    public void setMarket_price(Integer market_price) {
        this.market_price = market_price;
    }

    public Integer getDiscount_price() {
        return discount_price;
    }

    public void setDiscount_price(Integer discount_price) {
        this.discount_price = discount_price;
    }

    public Long getFirst_cid() {
        return first_cid;
    }

    public void setFirst_cid(Long first_cid) {
        this.first_cid = first_cid;
    }

    public Long getSecond_cid() {
        return second_cid;
    }

    public void setSecond_cid(Long second_cid) {
        this.second_cid = second_cid;
    }

    public Long getThird_cid() {
        return third_cid;
    }

    public void setThird_cid(Long third_cid) {
        this.third_cid = third_cid;
    }

    public PayType getPay_type() {
        return pay_type;
    }

    public void setPay_type(PayType pay_type) {
        this.pay_type = pay_type;
    }

    public Long getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(Long spec_id) {
        this.spec_id = spec_id;
    }

    public List<SpecPic> getSpec_pics() {
        return spec_pics;
    }

    @JSONField(name = "spec_pics")
    public void setSpec_pics(List<SpecPic> spec_pics) {
        this.spec_pics = spec_pics;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRecommend_remark() {
        return recommend_remark;
    }

    public void setRecommend_remark(String recommend_remark) {
        this.recommend_remark = recommend_remark;
    }

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }

    public PresellType getPresell_type() {
        return presell_type;
    }

    public void setPresell_type(PresellType presell_type) {
        this.presell_type = presell_type;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public CheckStatus getCheck_status() {
        return check_status;
    }

    public void setCheck_status(CheckStatus check_status) {
        this.check_status = check_status;
    }

    public String getProduct_id_str() {
        return product_id_str;
    }

    public void setProduct_id_str(String product_id_str) {
        this.product_id_str = product_id_str;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public List<Spec> getSpecs() {
        return specs;
    }

    public void setSpecs(List<Spec> specs) {
        this.specs = specs;
    }

    public List<SpecPrice> getSpec_prices() {
        return spec_prices;
    }

    public void setSpec_prices(List<SpecPrice> spec_prices) {
        this.spec_prices = spec_prices;
    }

    public Integer getMaximum_per_order() {
        return maximum_per_order;
    }

    public void setMaximum_per_order(Integer maximum_per_order) {
        this.maximum_per_order = maximum_per_order;
    }

    public Integer getLimit_per_buyer() {
        return limit_per_buyer;
    }

    public void setLimit_per_buyer(Integer limit_per_buyer) {
        this.limit_per_buyer = limit_per_buyer;
    }

    public Integer getMinimum_per_order() {
        return minimum_per_order;
    }

    public void setMinimum_per_order(Integer minimum_per_order) {
        this.minimum_per_order = minimum_per_order;
    }

    public CategoryDetail getCategory_detail() {
        return category_detail;
    }

    public void setCategory_detail(CategoryDetail category_detail) {
        this.category_detail = category_detail;
    }
}
