package com.im.lib.net;

import lombok.Data;

import java.util.LinkedList;

@Data
public class ParamInfo {
    private LinkedList<Object> dataParam;
    private Class<?> parameterType;
}
