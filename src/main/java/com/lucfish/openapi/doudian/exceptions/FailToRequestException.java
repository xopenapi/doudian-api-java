package com.lucfish.openapi.doudian.exceptions;

public class FailToRequestException extends RuntimeException {

    public FailToRequestException(String message, Throwable cause) {
        super(message, cause);
    }

    public FailToRequestException(String message) {
        super(message);
    }


}
