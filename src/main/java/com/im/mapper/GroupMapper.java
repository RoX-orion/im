package com.im.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.im.entity.Group;
import com.im.entity.User;
import com.im.entity.UserGroup;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GroupMapper extends BaseMapper<Group> {

    @Insert("insert into user_group(uid, group_id, create_time, update_time) values(#{uid}, #{groupId}, #{createTime}, #{updateTime})")
    void insertData(UserGroup userGroup);

    List<Group> getChat(@Param("uid") Long uid);
    @Select("select * from `group` where group_name like #{groupName}")
    List<Group> searchGroupVaguely(@Param("groupName") String groupName);

    @Select("select * from user where email = #{email}")
    User searchChat(@Param("email") String email);
}
