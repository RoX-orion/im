package com.im.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.im.config.Constant;
import com.im.entity.Group;
import com.im.entity.GroupMessage;
import com.im.entity.User;
import com.im.entity.UserGroup;
import com.im.lib.core.ServerContext;
import com.im.lib.entity.WsApiResult;
import com.im.lib.net.WriteData;
import com.im.mapper.GroupMapper;
import com.im.mapper.GroupMessageMapper;
import com.im.mapper.UserGroupMapper;
import com.im.utils.ChatUtil;
import com.im.utils.CommonUtil;
import com.im.vo.GroupMessageVo;
import io.netty.channel.Channel;
import io.netty.channel.ChannelId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
public class GroupService {

    @Resource
    private GroupMapper groupMapper;

    @Resource
    private UserGroupMapper userGroupMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private ServerContext serverContext;

    @Resource
    private GroupMessageMapper groupMessageMapper;

    @Resource
    private StateService stateService;

    @Resource
    private SendMessageService sendMessageService;

    @Transactional
    public void createGroup(Group group, HttpServletRequest request) {
        User userInfo = CommonUtil.getUserInfo(request);
        group.setMemberCount(1);
        group.setCreateUid(userInfo.getUid());
        groupMapper.insert(group);

        String shortLink = CommonUtil.toShortLink(Math.toIntExact(group.getGroupId()));
        group.setShareLink(shortLink);
        groupMapper.updateById(group);


        UserGroup userGroup = new UserGroup();
        userGroup.setUid(userInfo.getUid());
        userGroup.setGroupId(group.getGroupId());
        userGroup.setCreateTime(new Date());
        userGroup.setUpdateTime(new Date());

        groupMapper.insertData(userGroup);
    }

    @Transactional
    public void leaveGroup(Long groupId, HttpServletRequest request) {
        //??????group??????
        Group group = groupMapper.selectOne(new QueryWrapper<Group>().eq("group_id", groupId));
        groupMapper.delete(new QueryWrapper<Group>().eq("group_id", groupId));

        //??????user_group?????????
        User user = CommonUtil.getUserInfo(request);
        if (Objects.equals(group.getCreateUid(), user.getUid())) {// ??????????????????????????????
            List<Long> userGroupIds = userGroupMapper.selectIdByGroupId(groupId);
            userGroupMapper.deleteBatchIds(userGroupIds);
            //???????????????
            List<Object> messageIds = groupMessageMapper.selectObjs(new QueryWrapper<GroupMessage>().eq("group_id", groupId));
            //??????redis?????????
            stringRedisTemplate.delete(Constant.GROUP + groupId);
        } else {// ??????????????????
            String channelId = stringRedisTemplate.opsForValue().get(Constant.UID_CHANNEL_ID + user.getUid());
            stringRedisTemplate.opsForHash().delete(Constant.GROUP + groupId, channelId);
//            stringRedisTemplate.opsForHash().delete(Constant.GROUP + groupId, channelId);
//            WsApiResult wsApiResult = new WsApiResult("getGroupMessage", );
//            Set<Object> channelIds = stringRedisTemplate.opsForHash().keys(Constant.GROUP + groupId);
//            for (Object id : channelIds) {
//                Channel channel = serverContext.getChannel((String) id);
//                WriteData.write(channel, );
//            }
        }

        //??????redis????????????
        //TODO ??????redis????????????
    }

    public void sendGroupMessage(GroupMessage groupMessage, ChannelId id) {
        groupMessage.setSendStatus("sent");
        groupMessageMapper.insert(groupMessage);
        List<UserGroup> userGroups = userGroupMapper.selectList(new QueryWrapper<UserGroup>()
                .eq("group_id", groupMessage.getGroupId())
        );
        GroupMessageVo groupMessageVo = new GroupMessageVo();
        groupMessageVo.setList(Collections.singletonList(groupMessage));
        groupMessageVo.setGroupId(Math.toIntExact(groupMessage.getGroupId()));
        WsApiResult response = WsApiResult.ok("getGroupMessage", groupMessageVo);
        for (UserGroup userGroup : userGroups) {
            sendMessageService.sendGroupMessage(userGroup, id, response);
        }

        List<String> channelIds = stringRedisTemplate.opsForList().range(Constant.GROUP + groupMessage.getGroupId(), 0, -1);
        if (channelIds != null) {
            for (String channelId : channelIds) {
                if (!channelId.equals(id.asShortText())) {
                    Channel channel = serverContext.getChannel(channelId);
                    WriteData.write(channel, groupMessage);
                }
            }
        }
    }

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

    @Transactional
    public void joinGroup(Group group, HttpServletRequest request) {
        group.setMemberCount(group.getMemberCount() + 1);
        groupMapper.update(group, new QueryWrapper<Group>().eq("group_id", group.getGroupId()));

        User user = ChatUtil.getUserInfo(request);
        if (user != null) {
            GroupMessage groupMessage = groupMessageMapper.selectLatestGroupMessage(group.getGroupId());
            UserGroup userGroup = new UserGroup();
            userGroup.setGroupId(group.getGroupId());
            userGroup.setGroupMessageId(0L);
            userGroup.setUid(user.getUid());
            userGroupMapper.insert(userGroup);

            String channelId = stringRedisTemplate.opsForValue().get(Constant.UID_CHANNEL_ID + user.getUid());
            stateService.inGroup(channelId, user);
        }
    }
}
