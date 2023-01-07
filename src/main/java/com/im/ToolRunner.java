package com.im;

import com.im.lib.crypto.RSA;

import java.util.Scanner;

/**
 * Copyright (c) 2022 Aix Lina. All rights reserved.
 *
 * @author: Aix Lina
 * @date: 2022-12-11
 */

public class ToolRunner {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        String menu = """
            *************************************************************
            * [1]:计算RSA信息                                            *
            * ***********************************************************
        """;
        System.out.println(menu);
        System.out.print("请选择要进行的操作:");
        option = input.nextInt();
        switch (option) {
            case 1:
                RSA.computeRSAInfo();
                return;
            default:
                System.out.println("输入有误！");
        }
    }
}
