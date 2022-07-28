package com.im.lib.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD})
@Documented
public @interface WebsocketHandlerMapping {
    int value() default 0;

    String name() default "";
}
