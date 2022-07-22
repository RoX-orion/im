package com.im.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.im.entity.PrivateChatMessage;
import org.apache.ibatis.annotations.Select;

public interface PrivateChatMessageMapper extends BaseMapper<PrivateChatMessage> {
    @Select("select chat_message from private_chat_message where send_uid = #{sendUid} and to_uid = #{toUid} order by private_chat_message_id desc limit 1")
    String selectLastMessage(String sendUid, Long toUid);
}
