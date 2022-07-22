package com.im.lib.entity;

import lombok.Data;

import java.util.HashMap;

@Data
public class RequestData {
    private HashMap<String, Object> data;
    private String type;
}
