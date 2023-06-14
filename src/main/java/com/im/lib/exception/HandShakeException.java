package com.im.lib.exception;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @description: Disconnect TCP connection if any exception occurs during handshake
 * @author: Andre Lina
 * @date: 2023-06-13
 */

public class HandShakeException extends RuntimeException {

    private String message;

    public HandShakeException(String message) {
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
