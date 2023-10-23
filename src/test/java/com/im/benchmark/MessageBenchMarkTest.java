package com.im.benchmark;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.im.entity.benchmark.MessageBenchMark;
import com.im.mapper.benchmark.MessageMapper;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-10-13
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class MessageBenchMarkTest extends ServiceImpl<MessageMapper, MessageBenchMark> {

    @Resource
    private MessageMapper messageMapper;

    @Test
    public void message() {
        Date date = new Date();
        int n = 1;
        List<MessageBenchMark> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            MessageBenchMark messageBenchMark = new MessageBenchMark();
            messageBenchMark.setMessage(genMessage());
            messageBenchMark.setCreateTime(new Date(date.getTime() + i * 1000L));
            list.add(messageBenchMark);
        }
        int a = 1 / 10;
        long begin = System.nanoTime();
        this.saveBatch(list);
        System.out.println("Time:" + (System.nanoTime() - begin) / 1000000);
    }

    @Test
    public void getCount() {
        long begin = System.nanoTime();
        Long count = messageMapper.getCount();
        System.out.println(count);
        System.out.println("Time:" + (System.nanoTime() - begin) / 1000000);
    }

    @Test
    public void getList() {
        long begin = System.nanoTime();
        List<MessageBenchMark> list = messageMapper.getList();
        System.out.println(list);
        System.out.println("Time:" + (System.nanoTime() - begin) / 1000000);
    }

    public String genMessage() {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        int len = random.nextInt(1, 25);
        for (int i = 0; i < len; i++) {
            sb.append((char) random.nextInt(65, 123));
        }

        return sb.toString();
    }
}
