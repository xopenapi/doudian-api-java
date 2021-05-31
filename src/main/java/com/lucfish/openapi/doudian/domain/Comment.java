package com.lucfish.openapi.doudian.domain;

import java.util.List;

public class Comment {

    // 3539	评价id
    public String comment_id;
    // 3539925204033339668	商品id
    public Long product_id;
    // 女士衬衣	商品名称
    public String product_name;
    // 6496679971677798670	子订单号
    public Long order_id;
    // 2020-08-27 20:29:20	评价时间。
    public String comment_time;
    // 2011-01-01 00:00:00	评价更新时间
    public String update_time;
    // 1	评价等级，好评/中评/差评
    public Integer rate;
    // 感觉质量好	评价内容
    public String content;
    // 评价图片
    public List<Pic>	 photos;
    // 质量好	追加的评价内容
    public String append_content;
    // 追加的评价图片
    public List<Pic>	 append_photos;
    // 2011-01-01 00:00:00	追加评价时间
    public String append_time;
    // 是否已修改的评价
    public Boolean is_changed;
    // 1	商家回复状态
    public Boolean is_reply;
    // 感谢您的支持~	卖家回复的评论
    public String reply_content;

    public String getComment_id() {
        return comment_id;
    }

    public void setComment_id(String comment_id) {
        this.comment_id = comment_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getComment_time() {
        return comment_time;
    }

    public void setComment_time(String comment_time) {
        this.comment_time = comment_time;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAppend_content() {
        return append_content;
    }

    public void setAppend_content(String append_content) {
        this.append_content = append_content;
    }


    public String getAppend_time() {
        return append_time;
    }

    public void setAppend_time(String append_time) {
        this.append_time = append_time;
    }

    public Boolean getIs_changed() {
        return is_changed;
    }

    public void setIs_changed(Boolean is_changed) {
        this.is_changed = is_changed;
    }

    public Boolean getIs_reply() {
        return is_reply;
    }

    public void setIs_reply(Boolean is_reply) {
        this.is_reply = is_reply;
    }

    public String getReply_content() {
        return reply_content;
    }

    public void setReply_content(String reply_content) {
        this.reply_content = reply_content;
    }

    public List<Pic> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Pic> photos) {
        this.photos = photos;
    }

    public List<Pic> getAppend_photos() {
        return append_photos;
    }

    public void setAppend_photos(List<Pic> append_photos) {
        this.append_photos = append_photos;
    }
}
