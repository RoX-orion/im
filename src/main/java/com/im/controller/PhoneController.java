package com.im.controller;

import com.im.lib.annotation.WebsocketHandler;

@WebsocketHandler
public class PhoneController {
//
//	@WebsocketHandlerMapping(value = 0x55451fa9, name = "GetCallConfig")
//	public TLRPC.TL_dataJSON getCallConfig(PhoneApi.GetCallConfig getCallConfig) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x42ff96ed, name = "RequestCall")
//	public PhoneApi.PhoneCall requestCall(PhoneApi.RequestCall requestCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3bd2b4a0, name = "AcceptCall")
//	public PhoneApi.PhoneCall acceptCall(PhoneApi.AcceptCall acceptCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x2efe1722, name = "ConfirmCall")
//	public PhoneApi.PhoneCall confirmCall(PhoneApi.ConfirmCall confirmCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x17d54f61, name = "ReceivedCall")
//	public Boolean receivedCall(PhoneApi.ReceivedCall receivedCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb2cbc1c0, name = "DiscardCall")
//	public TLRPC.Updates discardCall(PhoneApi.DiscardCall discardCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x59ead627, name = "SetCallRating")
//	public TLRPC.Updates setCallRating(PhoneApi.SetCallRating setCallRating) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x277add7e, name = "SaveCallDebug")
//	public Boolean saveCallDebug(PhoneApi.SaveCallDebug saveCallDebug) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xff7a9383, name = "SendSignalingData")
//	public Boolean sendSignalingData(PhoneApi.SendSignalingData sendSignalingData) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x48cdc6d8, name = "CreateGroupCall")
//	public TLRPC.Updates createGroupCall(PhoneApi.CreateGroupCall createGroupCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb132ff7b, name = "JoinGroupCall")
//	public TLRPC.Updates joinGroupCall(PhoneApi.JoinGroupCall joinGroupCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x500377f9, name = "LeaveGroupCall")
//	public TLRPC.Updates leaveGroupCall(PhoneApi.LeaveGroupCall leaveGroupCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x7b393160, name = "InviteToGroupCall")
//	public TLRPC.Updates inviteToGroupCall(PhoneApi.InviteToGroupCall inviteToGroupCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x7a777135, name = "DiscardGroupCall")
//	public TLRPC.Updates discardGroupCall(PhoneApi.DiscardGroupCall discardGroupCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x74bbb43d, name = "ToggleGroupCallSettings")
//	public TLRPC.Updates toggleGroupCallSettings(PhoneApi.ToggleGroupCallSettings toggleGroupCallSettings) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x41845db, name = "GetGroupCall")
//	public PhoneApi.GroupCall getGroupCall(PhoneApi.GetGroupCall getGroupCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xc558d8ab, name = "GetGroupParticipants")
//	public PhoneApi.GroupParticipants getGroupParticipants(PhoneApi.GetGroupParticipants getGroupParticipants) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xb59cf977, name = "CheckGroupCall")
//	public int[] checkGroupCall(PhoneApi.CheckGroupCall checkGroupCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xf128c708, name = "ToggleGroupCallRecord")
//	public TLRPC.Updates toggleGroupCallRecord(PhoneApi.ToggleGroupCallRecord toggleGroupCallRecord) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xa5273abf, name = "EditGroupCallParticipant")
//	public TLRPC.Updates editGroupCallParticipant(PhoneApi.EditGroupCallParticipant editGroupCallParticipant) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x1ca6ac0a, name = "EditGroupCallTitle")
//	public TLRPC.Updates editGroupCallTitle(PhoneApi.EditGroupCallTitle editGroupCallTitle) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xef7c213a, name = "GetGroupCallJoinAs")
//	public PhoneApi.JoinAsPeers getGroupCallJoinAs(PhoneApi.GetGroupCallJoinAs getGroupCallJoinAs) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xe6aa647f, name = "ExportGroupCallInvite")
//	public PhoneApi.ExportedGroupCallInvite exportGroupCallInvite(PhoneApi.ExportGroupCallInvite exportGroupCallInvite) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x219c34e6, name = "ToggleGroupCallStartSubscription")
//	public TLRPC.Updates toggleGroupCallStartSubscription(PhoneApi.ToggleGroupCallStartSubscription toggleGroupCallStartSubscription) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x5680e342, name = "StartScheduledGroupCall")
//	public TLRPC.Updates startScheduledGroupCall(PhoneApi.StartScheduledGroupCall startScheduledGroupCall) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x575e1f8c, name = "SaveDefaultGroupCallJoinAs")
//	public Boolean saveDefaultGroupCallJoinAs(PhoneApi.SaveDefaultGroupCallJoinAs saveDefaultGroupCallJoinAs) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xcbea6bc4, name = "JoinGroupCallPresentation")
//	public TLRPC.Updates joinGroupCallPresentation(PhoneApi.JoinGroupCallPresentation joinGroupCallPresentation) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x1c50d144, name = "LeaveGroupCallPresentation")
//	public TLRPC.Updates leaveGroupCallPresentation(PhoneApi.LeaveGroupCallPresentation leaveGroupCallPresentation) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x1ab21940, name = "GetGroupCallStreamChannels")
//	public PhoneApi.GroupCallStreamChannels getGroupCallStreamChannels(PhoneApi.GetGroupCallStreamChannels getGroupCallStreamChannels) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0xdeb3abbf, name = "GetGroupCallStreamRtmpUrl")
//	public PhoneApi.GroupCallStreamRtmpUrl getGroupCallStreamRtmpUrl(PhoneApi.GetGroupCallStreamRtmpUrl getGroupCallStreamRtmpUrl) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x41248786, name = "SaveCallLog")
//	public Boolean saveCallLog(PhoneApi.SaveCallLog saveCallLog) {
//		return null;
//	}
}
