package com.lucfish.openapi.doudian.domain.enums;

// 订单APP渠道
public enum OrderBType {

    ZHAN_WAI(0, "站外"),
    HUO_SHAN(1, "火山"),
    DOU_YIN(2, "抖音"),
    TOU_TIAO(3, "头条"),
    XI_GUA(4, "西瓜"),
    WEI_XIN(5, "微信"),
    SHAN_GOU(6, "闪购"),
    TOU_TIAO_LITE(7, "头条lite版"),
    DONG_CHE_DI(8, "懂车帝"),
    PI_PI_XIA(9, "皮皮虾"),
    DOU_YIN_JI_SU(11, "抖音极速版"),
    TikTok(12, "TikTok");

    private int code;

    OrderBType(int code, String desc) {
        this.code = code;
    }


    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
