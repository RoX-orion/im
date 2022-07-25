package com.im.lib.tl;

import lombok.Data;

import java.util.HashMap;

@Data
public class NodeConfig {
    private String name;
    private Integer constructorId;
    private Integer subclassOfId;
    private HashMap<String, ArgsConfig> argsConfig;
    private String result;
    private Boolean isFunction;
    private String namespace;
}
