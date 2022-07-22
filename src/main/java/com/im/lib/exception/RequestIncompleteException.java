package com.im.lib.exception;

public class RequestIncompleteException extends RuntimeException{
    private final String message;

    public RequestIncompleteException(String message) {
        super(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
