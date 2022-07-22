package com.im.exception;

import java.util.Objects;

public class NotLoginException extends RuntimeException {
    public static final Integer TOKEN_TIMEOUT = 0;
    public static final String TOKEN_TIMEOUT_MESSAGE = "登录已过期";
    public static final Integer NOT_LOGIN = 1;
    public static final String NOT_LOGIN_MESSAGE = "该账户未登录";
    public Integer type;
    public String message;

    public NotLoginException(Integer type) {
        this.type = type;
        if (Objects.equals(type, TOKEN_TIMEOUT)) {
            setMessage(TOKEN_TIMEOUT_MESSAGE);
        } else if (Objects.equals(type, NOT_LOGIN)) {
            setMessage(NOT_LOGIN_MESSAGE);
        }
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
