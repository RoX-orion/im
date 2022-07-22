package com.im.lib.net;

import lombok.Data;

@Data
public class Request {
    private int CONSTRUCTOR_ID;
    private int SUBCLASS_OF_ID;
    private String className;
    private String classType;
}
