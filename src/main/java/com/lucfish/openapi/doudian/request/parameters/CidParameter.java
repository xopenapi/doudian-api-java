package com.lucfish.openapi.doudian.request.parameters;

import com.lucfish.openapi.doudian.utils.AssertUtils;

public class CidParameter {

    private Long cid;

    public CidParameter(Long cid) {
        AssertUtils.notNull(cid, "cid can not be null!");
        this.cid = cid;
    }

    public String getCid() {
        return this.cid.toString();
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

}
