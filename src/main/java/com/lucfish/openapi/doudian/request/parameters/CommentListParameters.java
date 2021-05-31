package com.lucfish.openapi.doudian.request.parameters;

public class CommentListParameters {

    // 3539925204033339668	商品id
    public String product_id;
    // 6496679971677798670	订单号，可以是子订单id号
    public String order_id;
    // 2011-01-01 00:00:00	评价开始时间。如果只输入开始时间，那么能返回开始时间之后的评价数据。
    public String start_time;
    // 2011-01-01 00:00:00	评价结束时间。如果只输入结束时间，那么全部返回所有评价数据。
    public String end_time;
    // create_time	create_time或者update_time，默认create_time
    public String order_by;
    // 否	1
    public String is_desc;
    // 1	评价等级，好评/中评/差评
    public Integer rate;
    // 1	商家回复状态
    public Boolean is_reply;
    // 0	页数，第1页从0开始
    public Integer page;
    // 100	每页条数，最大100
    public Integer size;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getStart_time() {
        return start_time;
    }

    public void setStart_time(String start_time) {
        this.start_time = start_time;
    }

    public String getEnd_time() {
        return end_time;
    }

    public void setEnd_time(String end_time) {
        this.end_time = end_time;
    }

    public String getOrder_by() {
        return order_by;
    }

    public void setOrder_by(String order_by) {
        this.order_by = order_by;
    }

    public String getIs_desc() {
        return is_desc;
    }

    public void setIs_desc(String is_desc) {
        this.is_desc = is_desc;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public Boolean getIs_reply() {
        return is_reply;
    }

    public void setIs_reply(Boolean is_reply) {
        this.is_reply = is_reply;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }
}
