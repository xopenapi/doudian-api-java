package io.github.xopenapi.doudian.domain.enums;

import java.util.Arrays;

/**
 * 付款方式
 */
public enum PayType {
    CashOnDelivery(0, "货到付款"),
    OnlinePayments(1, "在线支付"),
    Both(2, "两者都支持");

    private int code;

    PayType(int code, String desc) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PayType codeOf(int code) {
        return Arrays.stream(values())
                .filter( payType -> payType.code == code )
                .findFirst().orElse(null);
    }


    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
