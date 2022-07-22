package com.im.lib.entity;

import lombok.Data;

public class Api {
    @Data
    public static class DH extends Request {
        private String gap;
    }
}
