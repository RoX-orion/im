package com.im.lib.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(value={ElementType.TYPE})
@Documented
public @interface WebsocketHandler {
}
