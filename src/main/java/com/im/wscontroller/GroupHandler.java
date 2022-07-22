package com.im.wscontroller;

import com.im.entity.Group;
import com.im.entity.GroupMessage;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.annotation.WebsocketRequestParam;
import com.im.lib.entity.WsApiResult;
import com.im.service.GroupMessageService;
import com.im.service.GroupService;
import io.netty.channel.ChannelId;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

@Slf4j
@WebsocketHandler
public class GroupHandler {

    @Resource
    private GroupMessageService groupMessageService;

    @Resource
    private GroupService groupService;

    @WebsocketHandlerMapping("sendGroupMessage")
    public WsApiResult sendGroupMessage(GroupMessage groupMessage, ChannelId channelId) {
        groupService.sendGroupMessage(groupMessage, channelId);

        return WsApiResult.ok("sendGroupMessage", null);
    }

    @WebsocketHandlerMapping("getGroupInfo")
    public WsApiResult getGroupInfo(@WebsocketRequestParam Integer groupId,
                                    @WebsocketRequestParam Integer uid,
                                    @WebsocketRequestParam String type) {
        Group group = groupService.getGroupInfo(groupId, uid);

        return WsApiResult.ok(type, group);
    }

//    @WebsocketHandlerMapping("joinGroup")
//    public WsApiResult joinGroup(Group group, ChannelId channelId) {
//        groupService.joinGroup(group, channelId);
//
//        return WsApiResult.ok("joinGroup", null);
//    }
}
