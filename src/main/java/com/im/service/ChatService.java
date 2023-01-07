package com.im.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.config.Constant;
import com.im.entity.*;
import com.im.lib.core.ServerContext;
import com.im.lib.entity.WsApiResult;
import com.im.lib.exception.RequestIncompleteException;
import com.im.lib.net.WriteData;
import com.im.mapper.*;
import com.im.utils.PageUtil;
import io.netty.channel.Channel;
import io.netty.channel.ChannelId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

@Service
public class ChatService {

    @Resource
    private GroupMapper groupMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private ServerContext serverContext;

    @Resource
    private ChatMessageMapper chatMessageMapper;

    @Resource
    private GroupMessageMapper groupMessageMapper;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private StateService stateService;

    @Resource
    private RelationshipMapper relationshipMapper;

    @Resource
    private PrivateChatMessageMapper privateChatMessageMapper;

    public void online(String token, ChannelId channelId) {
        if (!StringUtils.hasLength(token)) {
            throw new RequestIncompleteException("上线时必须指定Token!");
        }
        String stringUser = stringRedisTemplate.opsForValue().get(token);
        User user;
        try {
            user = new ObjectMapper().readValue(stringUser, User.class);
            stateService.inGroup(channelId.asShortText(), user);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("上线用户: " + user);
    }

    public void offline(ChannelId channelId) {
        String uid = stringRedisTemplate.opsForValue().get(Constant.CHANNEL_ID_UID + channelId);

        // 用户状态设置为离线
        if (StringUtils.hasLength(uid)) {
            stringRedisTemplate.opsForValue().set(Constant.USER + uid, Constant.OFFLINE);
            stateService.outGroup(uid, channelId.asShortText());
        }
        // 删除authKey
        stringRedisTemplate.delete(Constant.AUTH_KEY_ID + channelId.asShortText());
    }

    public PageUtil getChatList(ChannelId channelId) {
        List<Object> list = new LinkedList<>();

        String uid = stringRedisTemplate.opsForValue().get(Constant.CHANNEL_ID_UID + channelId);
        // 获取我加入的群组
        List<Group> groups = groupMapper.getChat(Long.parseLong(Objects.requireNonNull(uid)));
        for (Group group : groups) {
            group.setLastMessage(groupMessageMapper.selectLastGroupMessage(group.getGroupId()));
        }

        // 获取我的好友，包括发起请求但还未同意的
        List<Relationship> relationships = relationshipMapper.selectList(
                new QueryWrapper<Relationship>()
                        .select("friend_uid", "status")
                        .eq("uid", uid));
        List<User> myAddUsers = relationships.stream().map(e -> {
            User user = userMapper.selectById(e.getFriendUid());
//            if (e.getStatus().equals("unCheck")) {
//                user.setLastMessage("对方尚未添加你为好友");
//                user.setAdded(Boolean.FALSE);
//            } else {
//                user.setLastMessage(privateChatMessageMapper.selectLastMessage(uid, user.getUid()));
//            }
            return user;
        }).toList();
        if (myAddUsers.size() != 0) {
            list.addAll(myAddUsers);
        }

        // 获取别人加我的请求
        List<Relationship> whoAddMes = relationshipMapper.selectList(
                new QueryWrapper<Relationship>()
                        .select("uid")
                        .eq("friend_uid", uid)
                        .eq("status", "unCheck")
        );

        List<Long> ids = whoAddMes.stream().map(Relationship::getUid).toList();
        if (ids.size() != 0) {
            List<User> addMeUsers = userMapper.selectBatchIds(ids);
//            for (User user : addMeUsers) {
//                user.setLastMessage("请求添加你为好友");
//                user.setAdded(Boolean.FALSE);
//            }
            list.addAll(addMeUsers);
        }

        list.addAll(groups);
        return new PageUtil(list, list.size());
    }

    public WsApiResult sendMessage(ChatMessage chatMessage) {
        chatMessage.setType("text");
        chatMessage.setStatus("noReceive");

        return null;
    }

    public WsApiResult sendMessageRpc(String channelId, ChatMessage chatMessage) {
        Channel channel = serverContext.getChannel(channelId);
        channel.writeAndFlush(chatMessage);

        return null;
    }

    public List<ChatMessage> getHistoryMessage(int offset, int size, Long groupId) {

        return chatMessageMapper.getGroupHistoryMessage(offset, size, groupId);
    }

    public List<GroupMessage> getGroupMessage(Integer groupId, ChannelId channelId) {
//        String s = Objects.requireNonNull(
//            stringRedisTemplate.opsForHash().get(Constant.GROUP + groupId, channelId.asShortText())
//        ).toString();
//        String[] split = s.split(":");
        List<GroupMessage> list = groupMessageMapper.getGroupMessage(groupId, 0);
//        if (list.size() != 0) {
//            stringRedisTemplate.opsForHash().put(
//                Constant.GROUP + groupId, channelId.asShortText(),
//                split[0] + ":" + list.get(list.size() - 1).getGroupMessageId()
//            );
//        }
        System.out.println(list);
        return list;
    }

    public List<Group> searchGroupVaguely(String groupName) {
        return groupMapper.searchGroupVaguely("%" + groupName + "%");
    }

    public User searchChat(String email) {
        return groupMapper.searchChat(email);
    }

//    @Transactional
//    public void addUser(User user, HttpServletRequest request) {
//        User userInfo = ChatUtil.getUserInfo(request);
//        Relationship relationship = new Relationship();
//        relationship.setUid(userInfo.getUid());
//        relationship.setFriendUid(user.getUid());
//        relationship.setUnreadCount(0L);
//        relationship.setOffset(0L);
//        relationship.setStatus("unCheck");
//
//        relationshipMapper.insert(relationship);
//
//        String channelId = stringRedisTemplate.opsForValue()
//                .get(Constant.UID_CHANNEL_ID + user.getUid());
//
//        Channel channel = serverContext.getChannel(channelId);
//
//        if (channel != null) {
////            WsApiResult newChat = WsApiResult.ok(1, userInfo);
////            WriteData.write(channel, newChat);
//        }
//    }

    public void sendChatMessage(PrivateChatMessage privateChatMessage) {
        privateChatMessage.setSendStatus("sent");
        User sender = userMapper.selectOne(
                new QueryWrapper<User>()
                        .select("username")
                        .eq("uid", privateChatMessage.getSendUid())
        );
        privateChatMessage.setSendUsername(sender.getUsername());

        User receiver = userMapper.selectOne(
                new QueryWrapper<User>()
                        .select("username")
                        .eq("uid", privateChatMessage.getToUid())
        );
        privateChatMessage.setToUsername(receiver.getUsername());

        privateChatMessageMapper.insert(privateChatMessage);

        String channelId = stringRedisTemplate.opsForValue().get(
                Constant.UID_CHANNEL_ID + privateChatMessage.getToUid()
        );
        Channel channel = serverContext.getChannel(channelId);
        if (channel != null) {
            WriteData.write(channel, privateChatMessage);
        }
    }

//    public User agreeAddUser(User user, HttpServletRequest request) {
//        User userInfo = ChatUtil.getUserInfo(request);
//        Relationship relationship = relationshipMapper.selectOne(
//                new QueryWrapper<Relationship>()
//                        .eq("uid", user.getUid())
//                        .eq("friend_uid", userInfo.getUid())
//        );
//        relationship.setStatus("added");
//        relationshipMapper.update(relationship, null);
//        user.setAdded(Boolean.TRUE);
//        user.setLastMessage("Hello!");
//        return user;
//    }
}
