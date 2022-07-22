package com.im.controller;

import com.im.service.TestThreadService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RestController
public class TestThread {

    @Resource
    private TestThreadService testThreadService;

    @RequestMapping("synchronization")
    public void synchronizationSend() {
        log.info("同步发送开始");
        long begin = System.currentTimeMillis();
        testThreadService.synchronizationSend();
        System.out.println("同步耗时:" + (System.currentTimeMillis() - begin));
    }

    @RequestMapping("asynchronous")
    public void asynchronousSend() {
        log.info("异步发送开始");
        long begin = System.currentTimeMillis();

        int taskSize = 500;
        for (int i = 0; i < taskSize; i++) {
            testThreadService.asynchronousSend(i);
        }


        System.out.println("异步发送耗时:" + (System.currentTimeMillis() - begin));
    }
}
