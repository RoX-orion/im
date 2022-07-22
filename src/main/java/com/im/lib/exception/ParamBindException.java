package com.im.lib.exception;

public class ParamBindException extends RuntimeException {
    private String message;

    public ParamBindException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
