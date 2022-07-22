package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PhoneController {

	@WebsocketHandlerMapping(value = 1430593449L, name = "GetCallConfig")
	public Api.DataJSON getCallConfig(PhoneApi.GetCallConfig getCallConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1124046573L, name = "RequestCall")
	public PhoneApi.PhoneCall requestCall(PhoneApi.RequestCall requestCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1003664544L, name = "AcceptCall")
	public PhoneApi.PhoneCall acceptCall(PhoneApi.AcceptCall acceptCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 788404002L, name = "ConfirmCall")
	public PhoneApi.PhoneCall confirmCall(PhoneApi.ConfirmCall confirmCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 399855457L, name = "ReceivedCall")
	public Boolean receivedCall(PhoneApi.ReceivedCall receivedCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2999697856L, name = "DiscardCall")
	public Api.Updates discardCall(PhoneApi.DiscardCall discardCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1508562471L, name = "SetCallRating")
	public Api.Updates setCallRating(PhoneApi.SetCallRating setCallRating) {
		return null;
	}

	@WebsocketHandlerMapping(value = 662363518L, name = "SaveCallDebug")
	public Boolean saveCallDebug(PhoneApi.SaveCallDebug saveCallDebug) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4286223235L, name = "SendSignalingData")
	public Boolean sendSignalingData(PhoneApi.SendSignalingData sendSignalingData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1221445336L, name = "CreateGroupCall")
	public Api.Updates createGroupCall(PhoneApi.CreateGroupCall createGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2972909435L, name = "JoinGroupCall")
	public Api.Updates joinGroupCall(PhoneApi.JoinGroupCall joinGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1342404601L, name = "LeaveGroupCall")
	public Api.Updates leaveGroupCall(PhoneApi.LeaveGroupCall leaveGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2067345760L, name = "InviteToGroupCall")
	public Api.Updates inviteToGroupCall(PhoneApi.InviteToGroupCall inviteToGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2054648117L, name = "DiscardGroupCall")
	public Api.Updates discardGroupCall(PhoneApi.DiscardGroupCall discardGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1958458429L, name = "ToggleGroupCallSettings")
	public Api.Updates toggleGroupCallSettings(PhoneApi.ToggleGroupCallSettings toggleGroupCallSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 68699611L, name = "GetGroupCall")
	public PhoneApi.GroupCall getGroupCall(PhoneApi.GetGroupCall getGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3310934187L, name = "GetGroupParticipants")
	public PhoneApi.GroupParticipants getGroupParticipants(PhoneApi.GetGroupParticipants getGroupParticipants) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3046963575L, name = "CheckGroupCall")
	public int[] checkGroupCall(PhoneApi.CheckGroupCall checkGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4045981448L, name = "ToggleGroupCallRecord")
	public Api.Updates toggleGroupCallRecord(PhoneApi.ToggleGroupCallRecord toggleGroupCallRecord) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2770811583L, name = "EditGroupCallParticipant")
	public Api.Updates editGroupCallParticipant(PhoneApi.EditGroupCallParticipant editGroupCallParticipant) {
		return null;
	}

	@WebsocketHandlerMapping(value = 480685066L, name = "EditGroupCallTitle")
	public Api.Updates editGroupCallTitle(PhoneApi.EditGroupCallTitle editGroupCallTitle) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4017889594L, name = "GetGroupCallJoinAs")
	public PhoneApi.JoinAsPeers getGroupCallJoinAs(PhoneApi.GetGroupCallJoinAs getGroupCallJoinAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3869926527L, name = "ExportGroupCallInvite")
	public PhoneApi.ExportedGroupCallInvite exportGroupCallInvite(PhoneApi.ExportGroupCallInvite exportGroupCallInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 563885286L, name = "ToggleGroupCallStartSubscription")
	public Api.Updates toggleGroupCallStartSubscription(PhoneApi.ToggleGroupCallStartSubscription toggleGroupCallStartSubscription) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1451287362L, name = "StartScheduledGroupCall")
	public Api.Updates startScheduledGroupCall(PhoneApi.StartScheduledGroupCall startScheduledGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1465786252L, name = "SaveDefaultGroupCallJoinAs")
	public Boolean saveDefaultGroupCallJoinAs(PhoneApi.SaveDefaultGroupCallJoinAs saveDefaultGroupCallJoinAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3421137860L, name = "JoinGroupCallPresentation")
	public Api.Updates joinGroupCallPresentation(PhoneApi.JoinGroupCallPresentation joinGroupCallPresentation) {
		return null;
	}

	@WebsocketHandlerMapping(value = 475058500L, name = "LeaveGroupCallPresentation")
	public Api.Updates leaveGroupCallPresentation(PhoneApi.LeaveGroupCallPresentation leaveGroupCallPresentation) {
		return null;
	}

	@WebsocketHandlerMapping(value = 447879488L, name = "GetGroupCallStreamChannels")
	public PhoneApi.GroupCallStreamChannels getGroupCallStreamChannels(PhoneApi.GetGroupCallStreamChannels getGroupCallStreamChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3736316863L, name = "GetGroupCallStreamRtmpUrl")
	public PhoneApi.GroupCallStreamRtmpUrl getGroupCallStreamRtmpUrl(PhoneApi.GetGroupCallStreamRtmpUrl getGroupCallStreamRtmpUrl) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1092913030L, name = "SaveCallLog")
	public Boolean saveCallLog(PhoneApi.SaveCallLog saveCallLog) {
		return null;
	}
}