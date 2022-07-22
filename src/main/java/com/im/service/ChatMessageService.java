package com.im.service;

import com.im.entity.GroupMessage;
import com.im.mapper.ChatMessageMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class ChatMessageService {
    @Resource
    private ChatMessageMapper chatMessageMapper;

    /**
     * 添加离线消息
     */
    @Transactional
    public void addMessage(GroupMessage groupMessage) {
        groupMessage.setSendStatus("sent");
//        chatMessageMapper.insert(groupMessage);
    }

    @Transactional
    public void getMessage(Long chatMessageId) {

    }
}
