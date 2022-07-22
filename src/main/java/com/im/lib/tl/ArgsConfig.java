package com.im.lib.tl;

import lombok.Data;

@Data
public class ArgsConfig {
    boolean isVector;
    boolean isFlag;
    boolean skipConstructorId;
    int flagIndex = -1;
    boolean flagIndicator = true;
    String type;
    Boolean useVectorId;
}
