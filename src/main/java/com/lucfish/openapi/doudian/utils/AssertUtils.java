package com.lucfish.openapi.doudian.utils;

import com.lucfish.openapi.doudian.exceptions.BadQueryException;

import java.util.Objects;

public class AssertUtils {

    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new BadQueryException(message);
        }
    }

    public static void notNull(Object obj, String message) {
        if (Objects.isNull(obj)) {
            throw new BadQueryException(message);
        }
    }

}
