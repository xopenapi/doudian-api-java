package io.github.xopenapi.doudian.domain.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum CheckStatus {

    None(0, "无"),
    Unreviewed(1, "未提审"),
    Reviewing(2, "审核中"),
    Approved(3, "审核通过"),
    ReviewRejected(4, "审核驳回"),
    Ban(5, "封禁"),
    WAIT_SALE(7, "审核通过，待上架状态");

    private int code;
    private String desc;

    CheckStatus(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }

    @JsonValue
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
