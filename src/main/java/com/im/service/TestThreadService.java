package com.im.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TestThreadService {
    public void synchronizationSend() {
        int taskSize = 500;
        for (int i = 0; i < taskSize; i++) {
            log.info(String.valueOf(i));
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    long begin;
    @Async
    public void asynchronousSend(int i) {
        if (i == 0) {
            begin = System.currentTimeMillis();
        } else if (i == 499) {
            System.out.println(System.currentTimeMillis() - begin);
        }
        log.info(String.valueOf(i));
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
