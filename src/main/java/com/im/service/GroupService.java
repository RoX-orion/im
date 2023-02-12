package com.im.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.im.entity.Group;
import com.im.entity.UserGroup;
import com.im.lib.core.ChannelManager;
import com.im.mapper.GroupMapper;
import com.im.mapper.GroupMessageMapper;
import com.im.mapper.UserGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class GroupService {

    @Resource
    private GroupMapper groupMapper;

    @Resource
    private UserGroupMapper userGroupMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private ChannelManager channelManager;

    @Resource
    private GroupMessageMapper groupMessageMapper;

    @Resource
    private StateService stateService;

    @Resource
    private SendMessageService sendMessageService;

//    @Transactional
//    public void createGroup(Group group, HttpServletRequest request) {
//        User userInfo = CommonUtil.getUserInfo(request);
//        group.setMemberCount(1);
//        group.setCreateUid(userInfo.getUid());
//        groupMapper.insert(group);
//
//        String shortLink = CommonUtil.toShortLink(Math.toIntExact(group.getGroupId()));
//        group.setShareLink(shortLink);
//        groupMapper.updateById(group);
//
//
//        UserGroup userGroup = new UserGroup();
//        userGroup.setUid(userInfo.getUid());
//        userGroup.setGroupId(group.getGroupId());
//        userGroup.setCreateTime(new Date());
//        userGroup.setUpdateTime(new Date());
//
//        groupMapper.insertData(userGroup);
//    }
//
//    @Transactional
//    public void leaveGroup(Long groupId, HttpServletRequest request) {
//        //删除group条目
//        Group group = groupMapper.selectOne(new QueryWrapper<Group>().eq("group_id", groupId));
//        groupMapper.delete(new QueryWrapper<Group>().eq("group_id", groupId));
//
//        //删除user_group中用户
//        User user = CommonUtil.getUserInfo(request);
//        if (Objects.equals(group.getCreateUid(), user.getUid())) {// 我建的群，删除所有人
//            List<Long> userGroupIds = userGroupMapper.selectIdByGroupId(groupId);
//            userGroupMapper.deleteBatchIds(userGroupIds);
//            //删除群消息
//            List<Object> messageIds = groupMessageMapper.selectObjs(new QueryWrapper<GroupMessage>().eq("group_id", groupId));
//            //删除redis群信息
//            stringRedisTemplate.delete(Constant.GROUP + groupId);
//        } else {// 仅我自己退出
//            String channelId = stringRedisTemplate.opsForValue().get(Constant.UID_CHANNEL_ID + user.getUid());
//            stringRedisTemplate.opsForHash().delete(Constant.GROUP + groupId, channelId);
////            stringRedisTemplate.opsForHash().delete(Constant.GROUP + groupId, channelId);
////            WsApiResult wsApiResult = new WsApiResult("getGroupMessage", );
////            Set<Object> channelIds = stringRedisTemplate.opsForHash().keys(Constant.GROUP + groupId);
////            for (Object id : channelIds) {
////                Channel channel = serverContext.getChannel((String) id);
////                WriteData.write(channel, );
////            }
//        }
//
//        //删除redis群组记录
//        //TODO 删除redis群组记录
//    }
//
//    public void sendGroupMessage(GroupMessage groupMessage, ChannelId id) {
//        groupMessage.setSendStatus("sent");
//        groupMessageMapper.insert(groupMessage);
//        List<UserGroup> userGroups = userGroupMapper.selectList(new QueryWrapper<UserGroup>()
//                .eq("group_id", groupMessage.getGroupId())
//        );
//        GroupMessageVo groupMessageVo = new GroupMessageVo();
//        groupMessageVo.setList(Collections.singletonList(groupMessage));
//        groupMessageVo.setGroupId(Math.toIntExact(groupMessage.getGroupId()));
////        WsApiResult response = WsApiResult.ok(1, groupMessageVo);
////        for (UserGroup userGroup : userGroups) {
////            sendMessageService.sendGroupMessage(userGroup, id, response);
////        }
//
//        List<String> channelIds = stringRedisTemplate.opsForList().range(Constant.GROUP + groupMessage.getGroupId(), 0, -1);
//        if (channelIds != null) {
//            for (String channelId : channelIds) {
//                if (!channelId.equals(id.asShortText())) {
//                    Channel channel = serverContext.getChannel(channelId);
//                    WriteData.write(channel, groupMessage);
//                }
//            }
//        }
//    }

    public Group getGroupInfo(Integer groupId, Integer uid) {
        Group group = groupMapper.selectOne(
                new QueryWrapper<Group>().eq("group_id", groupId)
        );
        UserGroup userGroup = userGroupMapper.selectOne(
                new QueryWrapper<UserGroup>().eq("uid", uid).eq("group_id", groupId)
        );

        if (userGroup == null) {
            group.setJoined(Boolean.FALSE);
        } else {
            group.setJoined(Boolean.TRUE);
        }

        return group;
    }

//    @Transactional
//    public void joinGroup(Group group, HttpServletRequest request) {
//        group.setMemberCount(group.getMemberCount() + 1);
//        groupMapper.update(group, new QueryWrapper<Group>().eq("group_id", group.getGroupId()));
//
//        User user = ChatUtil.getUserInfo(request);
//        if (user != null) {
//            GroupMessage groupMessage = groupMessageMapper.selectLatestGroupMessage(group.getGroupId());
//            UserGroup userGroup = new UserGroup();
//            userGroup.setGroupId(group.getGroupId());
//            userGroup.setGroupMessageId(0L);
//            userGroup.setUid(user.getUid());
//            userGroupMapper.insert(userGroup);
//
//            String channelId = stringRedisTemplate.opsForValue().get(Constant.UID_CHANNEL_ID + user.getUid());
//            stateService.inGroup(channelId, user);
//        }
//    }
}
