package com.im.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

/**
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * @author: RoX-orion
 * @date: 2021-09-29
 */

@Configuration
@PropertySource("classpath:application.yml")
public class MailConfig {

    private String host;
    private String username;
    private String password;
    private String port;

    @Autowired
    public void setUsername(@Value("${spring.mail.username}") String username) {
        this.username = username;
    }

    @Autowired
    public void setPassword(@Value("${spring.mail.password}") String password) {
        this.password = password;
    }

    @Autowired
    public void setPort(@Value("${spring.mail.port}") String port) {
        this.port = port;
    }

    @Autowired
    public void setHost(@Value("${spring.mail.host}") String host) {
        this.host = host;
    }

    @Bean
    public JavaMailSender javaMailSender() {
        JavaMailSenderImpl sender = new JavaMailSenderImpl();
        sender.setHost(host); //发件邮箱
        sender.setUsername(username);
        sender.setPassword(password);
        sender.setPort(Integer.parseInt(port));
        return sender;
    }
}
