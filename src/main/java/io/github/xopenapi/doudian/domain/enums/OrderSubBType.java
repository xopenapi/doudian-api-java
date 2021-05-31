package io.github.xopenapi.doudian.domain.enums;

// 订单来源类型
public enum OrderSubBType {

    WEI_ZHI(0, "未知"),
    APP(1, "app"),
    XIAO_CHENG_XU(2, "小程序"),
    H5(3, "h5");

    private int code;

    OrderSubBType(int code, String desc) {
        this.code = code;
    }


    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
