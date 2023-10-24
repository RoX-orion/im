package com.im.utils;

import org.junit.Test;

import java.util.Date;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-18
 */

public class TimeUtilTest {

    @Test
    public void getTheTimeAfterNDays() {
        System.out.println(TimeUtil.getTheTimeAfterNDays(10));
    }

    @Test
    public void getLocalTimeZoneOffset() {
        System.out.println(TimeUtil.getLocalTimeZoneOffset());
    }

    @Test
    public void getServerTime() {
        System.out.println((System.currentTimeMillis() / 1000));
        System.out.println((int) (System.currentTimeMillis() / 1000));
        System.out.println(1688907632);
    }

    @Test
    public void getFeatureTimestamp() {
        Date date = new Date();
        System.out.println(date);
        System.out.println(new Date(TimeUtil.getFeatureTimestamp(300 * 1000)));
//        System.out.println(TimeUtil.getFeatureTimestamp(12));
    }
}
