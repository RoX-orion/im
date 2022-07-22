package com.im.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.im.entity.ChatMessage;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ChatMessageMapper extends BaseMapper<ChatMessage> {

    @Select("select * from group_message where group_id = #{groupId} limit #{offset}, #{size}")
    List<ChatMessage> getGroupHistoryMessage(@Param("offset") int offset, @Param("size") int size, Long groupId);
}
