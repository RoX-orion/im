package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class PhoneController {

	@WebsocketHandlerMapping(value = 1430593449, name = "GetCallConfig")
	public Api.DataJSON getCallConfig(PhoneApi.GetCallConfig getCallConfig) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1124046573, name = "RequestCall")
	public PhoneApi.PhoneCall requestCall(PhoneApi.RequestCall requestCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1003664544, name = "AcceptCall")
	public PhoneApi.PhoneCall acceptCall(PhoneApi.AcceptCall acceptCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 788404002, name = "ConfirmCall")
	public PhoneApi.PhoneCall confirmCall(PhoneApi.ConfirmCall confirmCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 399855457, name = "ReceivedCall")
	public Boolean receivedCall(PhoneApi.ReceivedCall receivedCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1295269440, name = "DiscardCall")
	public Api.Updates discardCall(PhoneApi.DiscardCall discardCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1508562471, name = "SetCallRating")
	public Api.Updates setCallRating(PhoneApi.SetCallRating setCallRating) {
		return null;
	}

	@WebsocketHandlerMapping(value = 662363518, name = "SaveCallDebug")
	public Boolean saveCallDebug(PhoneApi.SaveCallDebug saveCallDebug) {
		return null;
	}

	@WebsocketHandlerMapping(value = -8744061, name = "SendSignalingData")
	public Boolean sendSignalingData(PhoneApi.SendSignalingData sendSignalingData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1221445336, name = "CreateGroupCall")
	public Api.Updates createGroupCall(PhoneApi.CreateGroupCall createGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1322057861, name = "JoinGroupCall")
	public Api.Updates joinGroupCall(PhoneApi.JoinGroupCall joinGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1342404601, name = "LeaveGroupCall")
	public Api.Updates leaveGroupCall(PhoneApi.LeaveGroupCall leaveGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2067345760, name = "InviteToGroupCall")
	public Api.Updates inviteToGroupCall(PhoneApi.InviteToGroupCall inviteToGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2054648117, name = "DiscardGroupCall")
	public Api.Updates discardGroupCall(PhoneApi.DiscardGroupCall discardGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1958458429, name = "ToggleGroupCallSettings")
	public Api.Updates toggleGroupCallSettings(PhoneApi.ToggleGroupCallSettings toggleGroupCallSettings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 68699611, name = "GetGroupCall")
	public PhoneApi.GroupCall getGroupCall(PhoneApi.GetGroupCall getGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = -984033109, name = "GetGroupParticipants")
	public PhoneApi.GroupParticipants getGroupParticipants(PhoneApi.GetGroupParticipants getGroupParticipants) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1248003721, name = "CheckGroupCall")
	public int[] checkGroupCall(PhoneApi.CheckGroupCall checkGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = -248985848, name = "ToggleGroupCallRecord")
	public Api.Updates toggleGroupCallRecord(PhoneApi.ToggleGroupCallRecord toggleGroupCallRecord) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1524155713, name = "EditGroupCallParticipant")
	public Api.Updates editGroupCallParticipant(PhoneApi.EditGroupCallParticipant editGroupCallParticipant) {
		return null;
	}

	@WebsocketHandlerMapping(value = 480685066, name = "EditGroupCallTitle")
	public Api.Updates editGroupCallTitle(PhoneApi.EditGroupCallTitle editGroupCallTitle) {
		return null;
	}

	@WebsocketHandlerMapping(value = -277077702, name = "GetGroupCallJoinAs")
	public PhoneApi.JoinAsPeers getGroupCallJoinAs(PhoneApi.GetGroupCallJoinAs getGroupCallJoinAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = -425040769, name = "ExportGroupCallInvite")
	public PhoneApi.ExportedGroupCallInvite exportGroupCallInvite(PhoneApi.ExportGroupCallInvite exportGroupCallInvite) {
		return null;
	}

	@WebsocketHandlerMapping(value = 563885286, name = "ToggleGroupCallStartSubscription")
	public Api.Updates toggleGroupCallStartSubscription(PhoneApi.ToggleGroupCallStartSubscription toggleGroupCallStartSubscription) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1451287362, name = "StartScheduledGroupCall")
	public Api.Updates startScheduledGroupCall(PhoneApi.StartScheduledGroupCall startScheduledGroupCall) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1465786252, name = "SaveDefaultGroupCallJoinAs")
	public Boolean saveDefaultGroupCallJoinAs(PhoneApi.SaveDefaultGroupCallJoinAs saveDefaultGroupCallJoinAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = -873829436, name = "JoinGroupCallPresentation")
	public Api.Updates joinGroupCallPresentation(PhoneApi.JoinGroupCallPresentation joinGroupCallPresentation) {
		return null;
	}

	@WebsocketHandlerMapping(value = 475058500, name = "LeaveGroupCallPresentation")
	public Api.Updates leaveGroupCallPresentation(PhoneApi.LeaveGroupCallPresentation leaveGroupCallPresentation) {
		return null;
	}

	@WebsocketHandlerMapping(value = 447879488, name = "GetGroupCallStreamChannels")
	public PhoneApi.GroupCallStreamChannels getGroupCallStreamChannels(PhoneApi.GetGroupCallStreamChannels getGroupCallStreamChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = -558650433, name = "GetGroupCallStreamRtmpUrl")
	public PhoneApi.GroupCallStreamRtmpUrl getGroupCallStreamRtmpUrl(PhoneApi.GetGroupCallStreamRtmpUrl getGroupCallStreamRtmpUrl) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1092913030, name = "SaveCallLog")
	public Boolean saveCallLog(PhoneApi.SaveCallLog saveCallLog) {
		return null;
	}
}