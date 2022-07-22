package com.im.controller;

import com.im.entity.Group;
import com.im.entity.User;
import com.im.entity.output.ApiResult;
import com.im.service.ChatService;
import com.im.service.GroupService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@RestController("chat")
public class ChatController {
    @Resource
    private GroupService groupService;

    @Resource
    private ChatService chatService;

    @RequestMapping(value = "group", method = RequestMethod.POST)
    public ApiResult createGroup(@RequestBody Group group,
                                 HttpServletRequest request) {
        groupService.createGroup(group, request);

        return ApiResult.ok();
    }

    @RequestMapping(value = "group/{groupId}", method = RequestMethod.DELETE)
    public ApiResult leaveGroup(@PathVariable("groupId") Long groupId, HttpServletRequest request) {
        groupService.leaveGroup(groupId, request);

        return ApiResult.ok();
    }

    @RequestMapping(value = "group/joinGroup", method = RequestMethod.POST)
    public ApiResult joinGroup(@RequestBody Group group, HttpServletRequest request) {
        groupService.joinGroup(group, request);

        return ApiResult.ok();
    }

    @RequestMapping(value = "user/add-user", method = RequestMethod.POST)
    public ApiResult addUser(@RequestBody User user, HttpServletRequest request) {
        chatService.addUser(user, request);

        return ApiResult.ok();
    }

    @RequestMapping(value = "user/agree", method = RequestMethod.POST)
    public ApiResult agreeAddUser(@RequestBody User user, HttpServletRequest request) {
        user = chatService.agreeAddUser(user, request);

        return ApiResult.ok(user);
    }

    @RequestMapping(value = "user/refuse", method = RequestMethod.POST)
    public ApiResult refuseAddUser() {
        return ApiResult.ok();
    }
}
