package com.im.vo;

import com.im.entity.GroupMessage;
import lombok.Data;

import java.util.List;

@Data
public class GroupMessageVo {
    private List<GroupMessage> list;
    private Integer groupId;
}
