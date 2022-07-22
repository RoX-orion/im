package com.im.lib.tl;

import lombok.Data;

import java.util.HashMap;

@Data
public class NodeConfig {
    private String name;
    private Long constructorId;
    private HashMap<String, ArgsConfig> argsConfig;
    private long subclassOfId;
    private String result;
    private Boolean isFunction;
    private String namespace;
}
