package com.im.lib.tl;

import lombok.Data;

@Data
public class ArgsConfig {

    private String argName;

    private boolean isVector;
    private boolean isFlag;
    private boolean skipConstructorId;

    private int flagGroup;

    private int flagIndex = -1;

    private boolean flagIndicator = true;

    private String type;

    private Boolean useVectorId;
}
