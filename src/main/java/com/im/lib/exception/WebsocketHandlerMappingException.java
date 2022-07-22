package com.im.lib.exception;

public class WebsocketHandlerMappingException extends RuntimeException {

    private String message;

    public WebsocketHandlerMappingException(String message) {
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
