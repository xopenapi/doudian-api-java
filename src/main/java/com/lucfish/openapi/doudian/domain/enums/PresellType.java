package com.lucfish.openapi.doudian.domain.enums;

/**
 * 预售
 */
public enum PresellType {
    Not(0, "非预售"),
    Full(1, "全款"),
    STEP(2, "阶梯库存");

    private int code;

    PresellType(int code, String desc) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static PresellType codeOf(int code) {
        if (code == 1) {
            return PresellType.Full;
        }
        return PresellType.Not;
    }

    @Override
    public String toString() {
        return String.valueOf(code);
    }
}
