package com.im.lib.net;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-03-15
 */

public enum Errors {

    // =====================Server Exception=========================
    AUTH_KEY_UNREGISTERED(401, "The key is not registered in the system."),

    // =======================Rpc Error========================
    BAD_SERVER_SALT(48, "incorrect server salt"),
    PHONE_NUMBER_UNOCCUPIED(400, "The phone number is not yet being used."),
    LANG_CODE_NOT_SUPPORTED(400, "The specified language code is not supported.")
    ;

    private int code;

    private String description;

    Errors(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
