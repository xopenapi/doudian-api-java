package io.github.xopenapi.doudian.domain;

import java.util.List;

public class Order {

    // 订单ID，带大写字母A
    private String order_id;
    //店铺ID
    private Long shop_id;
    // 在抖音小程序下单时，买家的抖音小程序ID
    private String open_id;
    // 订单状态
    private Integer order_status;
    // 订单类型 (0实物，2普通虚拟，4poi核销，5三方核销，6服务市场)
    private Integer order_type;
    // 子订单列表
    private List<ChildOrder> child;
    // 子订单数量
    private Integer child_num;
    // 收件人地址
    private Address post_addr;
    // 邮政编码
    private String post_code;
    // 收件人姓名
    private String post_receiver;
    // 收件人电话
    private String post_tel;
    // 买家备注
    private String buyer_words;
    // 卖家备注
    private String seller_words;
    // 物流公司ID 各ID对应的物流公司
    private Integer logistics_id;
    // 物流单号
    private String logistics_code;
    // 发货时间。未发货时为"0"，已发货返回秒级时间戳
    private Long logistics_time;
    // 收货时间。未收货时为"0"，已发货返回秒级时间戳
    private Long receipt_time;
    // 订单创建时间，例如 "1512553757"
    private Long create_time;
    // 订单更新时间
    private Long update_time;
    // 订单最晚发货时间，例如 1512553887
    private Long exp_ship_time;
    // 订单取消原因
    private String cancel_reason;
    // 支付类型 (0：货到付款，1：微信，2：支付宝）
    private Integer pay_type;
    // 支付时间 (pay_type为0货到付款时, 此字段为空)，例如"2018-06-01 12:00:00"
    private Long pay_time;
    // 邮费金额 (单位: 分)
    private Integer post_amount;
    // 平台优惠券金额 (单位: 分)
    private Integer coupon_amount;
    // 商家优惠券金额 (单位: 分)
    private Integer shop_coupon_amount;
    // 优惠券id
    private Long coupon_meta_id;
    // 优惠券详情 (type为优惠券类型，具体如下表所示, credit为优惠金额,单位分)
    private List<CouponInfo> coupon_info;
    // 订单实付金额（不包含运费）
    private Integer order_total_amount;
    // 是否评价 :1已评价，0未评价
    private Integer is_comment;
    // 催单次数
    private Integer urge_cnt;
    // 订单APP渠道
    private Integer b_type;
    // 订单来源类型
    private Integer sub_b_type;
    // 订单业务类型
    private Integer c_biz;
    // 是否有退货运费险
    private Boolean is_insurance;

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public String getOpen_id() {
        return open_id;
    }

    public void setOpen_id(String open_id) {
        this.open_id = open_id;
    }

    public Integer getOrder_status() {
        return order_status;
    }

    public void setOrder_status(Integer order_status) {
        this.order_status = order_status;
    }

    public Integer getOrder_type() {
        return order_type;
    }

    public void setOrder_type(Integer order_type) {
        this.order_type = order_type;
    }

    public List<ChildOrder> getChild() {
        return child;
    }

    public void setChild(List<ChildOrder> child) {
        this.child = child;
    }

    public Integer getChild_num() {
        return child_num;
    }

    public void setChild_num(Integer child_num) {
        this.child_num = child_num;
    }

    public Address getPost_addr() {
        return post_addr;
    }

    public void setPost_addr(Address post_addr) {
        this.post_addr = post_addr;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public String getPost_receiver() {
        return post_receiver;
    }

    public void setPost_receiver(String post_receiver) {
        this.post_receiver = post_receiver;
    }

    public String getPost_tel() {
        return post_tel;
    }

    public void setPost_tel(String post_tel) {
        this.post_tel = post_tel;
    }

    public String getBuyer_words() {
        return buyer_words;
    }

    public void setBuyer_words(String buyer_words) {
        this.buyer_words = buyer_words;
    }

    public String getSeller_words() {
        return seller_words;
    }

    public void setSeller_words(String seller_words) {
        this.seller_words = seller_words;
    }

    public Integer getLogistics_id() {
        return logistics_id;
    }

    public void setLogistics_id(Integer logistics_id) {
        this.logistics_id = logistics_id;
    }

    public String getLogistics_code() {
        return logistics_code;
    }

    public void setLogistics_code(String logistics_code) {
        this.logistics_code = logistics_code;
    }

    public Long getLogistics_time() {
        return logistics_time;
    }

    public void setLogistics_time(Long logistics_time) {
        this.logistics_time = logistics_time;
    }

    public Long getReceipt_time() {
        return receipt_time;
    }

    public void setReceipt_time(Long receipt_time) {
        this.receipt_time = receipt_time;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public Long getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Long update_time) {
        this.update_time = update_time;
    }

    public Long getExp_ship_time() {
        return exp_ship_time;
    }

    public void setExp_ship_time(Long exp_ship_time) {
        this.exp_ship_time = exp_ship_time;
    }

    public String getCancel_reason() {
        return cancel_reason;
    }

    public void setCancel_reason(String cancel_reason) {
        this.cancel_reason = cancel_reason;
    }

    public Integer getPay_type() {
        return pay_type;
    }

    public void setPay_type(Integer pay_type) {
        this.pay_type = pay_type;
    }

    public Long getPay_time() {
        return pay_time;
    }

    public void setPay_time(Long pay_time) {
        this.pay_time = pay_time;
    }

    public Integer getPost_amount() {
        return post_amount;
    }

    public void setPost_amount(Integer post_amount) {
        this.post_amount = post_amount;
    }

    public Integer getCoupon_amount() {
        return coupon_amount;
    }

    public void setCoupon_amount(Integer coupon_amount) {
        this.coupon_amount = coupon_amount;
    }

    public Integer getShop_coupon_amount() {
        return shop_coupon_amount;
    }

    public void setShop_coupon_amount(Integer shop_coupon_amount) {
        this.shop_coupon_amount = shop_coupon_amount;
    }

    public Long getCoupon_meta_id() {
        return coupon_meta_id;
    }

    public void setCoupon_meta_id(Long coupon_meta_id) {
        this.coupon_meta_id = coupon_meta_id;
    }

    public List<CouponInfo> getCoupon_info() {
        return coupon_info;
    }

    public void setCoupon_info(List<CouponInfo> coupon_info) {
        this.coupon_info = coupon_info;
    }

    public Integer getOrder_total_amount() {
        return order_total_amount;
    }

    public void setOrder_total_amount(Integer order_total_amount) {
        this.order_total_amount = order_total_amount;
    }

    public Integer getIs_comment() {
        return is_comment;
    }

    public void setIs_comment(Integer is_comment) {
        this.is_comment = is_comment;
    }

    public Integer getUrge_cnt() {
        return urge_cnt;
    }

    public void setUrge_cnt(Integer urge_cnt) {
        this.urge_cnt = urge_cnt;
    }

    public Integer getB_type() {
        return b_type;
    }

    public void setB_type(Integer b_type) {
        this.b_type = b_type;
    }

    public Integer getSub_b_type() {
        return sub_b_type;
    }

    public void setSub_b_type(Integer sub_b_type) {
        this.sub_b_type = sub_b_type;
    }

    public Integer getC_biz() {
        return c_biz;
    }

    public void setC_biz(Integer c_biz) {
        this.c_biz = c_biz;
    }

    public Boolean getIs_insurance() {
        return is_insurance;
    }

    public void setIs_insurance(Boolean is_insurance) {
        this.is_insurance = is_insurance;
    }

}
