package com.im.lib.entity;

import lombok.Data;

@Data
public class ParamInfo {
    private Object[] methodParams;

    private boolean channelIdExist;
}
