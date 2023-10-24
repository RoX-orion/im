package com.im.utils;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-18
 */

public class TimeUtil {

    private TimeUtil() {}

    public static int getTheTimeAfterNDays(int n) {
        LocalDateTime localDateTime = LocalDateTime.now().plusDays(n);
        return (int) localDateTime.toEpochSecond(getLocalTimeZoneOffset());
    }

    public static ZoneOffset getLocalTimeZoneOffset() {
         return OffsetDateTime.now().getOffset();
    }

    /**
     * @return timestamp of second
     */
    public static long getFeatureTimestamp(long millisecond) {
        return System.currentTimeMillis() + millisecond;
    }
}
