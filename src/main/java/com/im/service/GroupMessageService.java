package com.im.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.im.entity.GroupMessage;
import com.im.mapper.GroupMessageMapper;
import com.im.utils.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;

@Service
public class GroupMessageService {
    @Resource
    private GroupMessageMapper groupMessageMapper;

    public GroupMessage checkGroupMessageComplete(HashMap<String, Object> data) {
        Long groupId = ((Integer)data.get("groupId")).longValue();
        String content = (String) data.get("content");
        Long uid = ((Integer) data.get("uid")).longValue();
        String username = (String) data.get("username");

        if (content != null && content.trim().length() != 0 && username != null && username.trim().length() != 0) {
            return new GroupMessage().setGroupId(groupId)
                    .setContent(content)
                    .setSendStatus("sent")
                    .setUid(uid)
                    .setUsername(username);
        } else {
            throw new NullPointerException();
        }
    }

    public PageUtil getGroupMessage(Integer groupId, Integer uid) {
        int offset = groupMessageMapper.selectId(groupId, uid);
        Page<GroupMessage> groupMessagePage = new Page<>(offset, 5);
        Page<GroupMessage> page = groupMessageMapper.selectPage(groupMessagePage, null);
//        groupMessageMapper.update(page.getRecords().get(), )
        return new PageUtil(page.getRecords(), page.getSize());
    }
}
