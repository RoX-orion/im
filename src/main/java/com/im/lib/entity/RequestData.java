package com.im.lib.entity;

import lombok.Data;

import java.util.HashMap;

@Data
public class RequestData {
    private long authKeyId;
    private Object requestParam;
    private int constructorId;
}
