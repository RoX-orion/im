package com.im.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.im.entity.GroupIdOffset;
import com.im.entity.UserGroup;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserGroupMapper extends BaseMapper<UserGroup> {
    List<Long> selectIdByGroupId(@Param("groupId") Long groupId);

    @Select("select group_id, group_message_id as offset from user_group where uid = #{uid}")
    List<GroupIdOffset> getGroupIdByUid(@Param("uid") Long uid);
}
