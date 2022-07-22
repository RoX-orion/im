package com.im.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.im.entity.GroupMessage;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GroupMessageMapper extends BaseMapper<GroupMessage> {
//    @Insert("select ")
    int selectId(@Param("groupId") Integer groupId, @Param("uid") Integer uid);

    List<GroupMessage> getGroupMessage(@Param("groupId") Integer groupId, @Param("offset") Integer offset);

    @Select("select * from group_message where group_id = #{groupId} order by group_message_id desc limit 1")
    GroupMessage selectLatestGroupMessage(Long groupId);

    @Select("SELECT content FROM `group_message` WHERE group_id = #{groupId} order by group_message_id desc LIMIT 1")
    String selectLastGroupMessage(@Param("groupId") Long groupId);
}
