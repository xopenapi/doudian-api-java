package com.lucfish.openapi.doudian.domain.enums;

import java.util.Arrays;

/**
 * 付款方式
 */
public enum OrderType {
    QI_TA(100, "其他"),
    SHI_WU(0, "实物"),
    XU_NI(2, "普通虚拟"),
    POI_HE_XIAO(4, "poi核销"),
    SAN_FANG_HE_XIAO(5, "三方核销"),
    FU_WU_SHI_CHANG(6, "服务市场");

    private int code;

    OrderType(int code, String desc) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static OrderType codeOf(int code) {
        return Arrays.stream(values())
                .filter( payType -> payType.code == code )
                .findFirst().orElse(null);
    }


    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
