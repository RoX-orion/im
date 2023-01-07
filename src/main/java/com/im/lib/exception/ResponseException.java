package com.im.lib.exception;

/**
 * Copyright (c) 2022 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-01-07
 */

public class ResponseException extends RuntimeException {
    private String message;

    public ResponseException(String message) {
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
