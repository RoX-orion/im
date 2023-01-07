package com.im.lib.tl;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class NodeConfig {

    private String name;

    private Integer constructorId;

    private Integer subclassOfId;

    private List<String> argsName = new ArrayList<>();

    private List<ArgsConfig> argsConfig = new ArrayList<>();

    /**
     * 返回值
     */
    private String result;

    private Boolean isFunction;

    private String namespace;
}
