package com.im.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.entity.User;

import javax.servlet.http.HttpServletRequest;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DecimalFormat;
import java.util.Random;

/**
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * @author RoX-orion
 * @date 2021-02-24
 * @since 1.0.0
 */
public class CommonUtil {

    private final static String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    private final static char[] map = str.toCharArray();

    private static final char[] hex_char = {
        '0', '1', '2', '3',
        '4', '5', '6', '7',
        '8', '9', 'a', 'b',
        'c', 'd', 'e', 'f'
    };

    @SuppressWarnings("all")
    public static double parseMillisecond(long time) {
        long min = time / 60000;
        return min + ((time / 1000) - min * 60) / 100.0;
    }

    public static String formatByte(Long byteNumber) {
        //换算单位
        double FORMAT = 1024.0;
        double kbNumber = byteNumber / FORMAT;
        if (kbNumber < FORMAT) {
            return new DecimalFormat("#KB").format(kbNumber);
        }
        double mbNumber = kbNumber / FORMAT;
        if (mbNumber < FORMAT) {
            return new DecimalFormat("#.#MB").format(mbNumber);
        }
        double gbNumber = mbNumber / FORMAT;
        if (gbNumber < FORMAT) {
            return new DecimalFormat("#.##GB").format(gbNumber);
        }
        double tbNumber = gbNumber / FORMAT;
        return new DecimalFormat("#.##TB").format(tbNumber);
    }

    public static User getUserInfo(HttpServletRequest request) {
        try {
            return new ObjectMapper().readValue(request.getAttribute("userInfo").toString(), User.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String toShortLink(int num) {
        StringBuilder shortLink = new StringBuilder();
        while (num > 0) {
            shortLink.append(map[num % 62]);
            num /= 62;
        }

        return shortLink.reverse().toString();
    }

    public static int shortLinkToNum(String shortLink) {
        char[] charArray = shortLink.toCharArray();
        int num = 0;
        for (char c : charArray) {
            num = num * 62 + str.indexOf(c);
        }

        return num;
    }

//    public static boolean isHttp(String link) {
//        return link.startsWith(Constant.HTTP) || link.startsWith(Constant.HTTPS);
//    }


    public static String getHostIp() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ignored) {
        }
        return "127.0.0.1";
    }

    public static String getHostName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException ignored) {
        }
        return "Unknown";
    }

    public static String getSixLengthNumberCheckCode() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }

    public static String getSixLengthHexString() {
        Random random = new Random();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 6; i++) {
            builder.append(hex_char[random.nextInt(16)]);
        }

        return builder.toString();
    }
}
