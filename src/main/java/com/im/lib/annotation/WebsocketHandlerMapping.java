package com.im.lib.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = {ElementType.METHOD})
@Documented
public @interface WebsocketHandlerMapping {
    long value() default 0L;

    String name() default "";
}
