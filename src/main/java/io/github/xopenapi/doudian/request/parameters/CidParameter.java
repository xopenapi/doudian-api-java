package io.github.xopenapi.doudian.request.parameters;

import io.github.xopenapi.doudian.utils.AssertUtils;

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
