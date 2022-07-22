package com.im.lib.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.PARAMETER})
@Documented
public @interface WebsocketRequestParam {

}
