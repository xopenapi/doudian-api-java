package com.lucfish.openapi.doudian.request.parameters;

import com.lucfish.openapi.doudian.utils.AssertUtils;

public class ProductCatePropertyParameter {

    private Long first_cid;
    private Long second_cid;
    private Long third_cid;

    public ProductCatePropertyParameter(Long firstCid, Long secondCid, Long thirdCid) {
        AssertUtils.isTrue( firstCid != null && secondCid != null && thirdCid != null, "缺少参数");

        this.first_cid = firstCid;
        this.second_cid = secondCid;
        this.third_cid = thirdCid;
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
}
