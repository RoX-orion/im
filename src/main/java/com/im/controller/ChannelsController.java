package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class ChannelsController {

	@WebsocketHandlerMapping(value = 0xcc104937, name = "ReadHistory")
	public Boolean readHistory(ChannelsApi.ReadHistory readHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x84c1fd4e, name = "DeleteMessages")
	public MessagesApi.AffectedMessages deleteMessages(ChannelsApi.DeleteMessages deleteMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf44a8315, name = "ReportSpam")
	public Boolean reportSpam(ChannelsApi.ReportSpam reportSpam) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xad8c9a23, name = "GetMessages")
	public MessagesApi.Messages getMessages(ChannelsApi.GetMessages getMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x77ced9d0, name = "GetParticipants")
	public ChannelsApi.ChannelParticipants getParticipants(ChannelsApi.GetParticipants getParticipants) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa0ab6cc6, name = "GetParticipant")
	public ChannelsApi.ChannelParticipant getParticipant(ChannelsApi.GetParticipant getParticipant) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xa7f6bbb, name = "GetChannels")
	public MessagesApi.Chats getChannels(ChannelsApi.GetChannels getChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8736a09, name = "GetFullChannel")
	public MessagesApi.ChatFull getFullChannel(ChannelsApi.GetFullChannel getFullChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3d5fb10f, name = "CreateChannel")
	public Api.Updates createChannel(ChannelsApi.CreateChannel createChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd33c8902, name = "EditAdmin")
	public Api.Updates editAdmin(ChannelsApi.EditAdmin editAdmin) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x566decd0, name = "EditTitle")
	public Api.Updates editTitle(ChannelsApi.EditTitle editTitle) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf12e57c9, name = "EditPhoto")
	public Api.Updates editPhoto(ChannelsApi.EditPhoto editPhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x10e6bd2c, name = "CheckUsername")
	public Boolean checkUsername(ChannelsApi.CheckUsername checkUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3514b3de, name = "UpdateUsername")
	public Boolean updateUsername(ChannelsApi.UpdateUsername updateUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x24b524c5, name = "JoinChannel")
	public Api.Updates joinChannel(ChannelsApi.JoinChannel joinChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf836aa95, name = "LeaveChannel")
	public Api.Updates leaveChannel(ChannelsApi.LeaveChannel leaveChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x199f3a6c, name = "InviteToChannel")
	public Api.Updates inviteToChannel(ChannelsApi.InviteToChannel inviteToChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc0111fe3, name = "DeleteChannel")
	public Api.Updates deleteChannel(ChannelsApi.DeleteChannel deleteChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe63fadeb, name = "ExportMessageLink")
	public Api.ExportedMessageLink exportMessageLink(ChannelsApi.ExportMessageLink exportMessageLink) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1f69b606, name = "ToggleSignatures")
	public Api.Updates toggleSignatures(ChannelsApi.ToggleSignatures toggleSignatures) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf8b036af, name = "GetAdminedPublicChannels")
	public MessagesApi.Chats getAdminedPublicChannels(ChannelsApi.GetAdminedPublicChannels getAdminedPublicChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x96e6cd81, name = "EditBanned")
	public Api.Updates editBanned(ChannelsApi.EditBanned editBanned) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x33ddf480, name = "GetAdminLog")
	public ChannelsApi.AdminLogResults getAdminLog(ChannelsApi.GetAdminLog getAdminLog) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xea8ca4f9, name = "SetStickers")
	public Boolean setStickers(ChannelsApi.SetStickers setStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xeab5dc38, name = "ReadMessageContents")
	public Boolean readMessageContents(ChannelsApi.ReadMessageContents readMessageContents) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9baa9647, name = "DeleteHistory")
	public Api.Updates deleteHistory(ChannelsApi.DeleteHistory deleteHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xeabbb94c, name = "TogglePreHistoryHidden")
	public Api.Updates togglePreHistoryHidden(ChannelsApi.TogglePreHistoryHidden togglePreHistoryHidden) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8341ecc0, name = "GetLeftChannels")
	public MessagesApi.Chats getLeftChannels(ChannelsApi.GetLeftChannels getLeftChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf5dad378, name = "GetGroupsForDiscussion")
	public MessagesApi.Chats getGroupsForDiscussion(ChannelsApi.GetGroupsForDiscussion getGroupsForDiscussion) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x40582bb2, name = "SetDiscussionGroup")
	public Boolean setDiscussionGroup(ChannelsApi.SetDiscussionGroup setDiscussionGroup) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8f38cd1f, name = "EditCreator")
	public Api.Updates editCreator(ChannelsApi.EditCreator editCreator) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x58e63f6d, name = "EditLocation")
	public Boolean editLocation(ChannelsApi.EditLocation editLocation) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xedd49ef0, name = "ToggleSlowMode")
	public Api.Updates toggleSlowMode(ChannelsApi.ToggleSlowMode toggleSlowMode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x11e831ee, name = "GetInactiveChannels")
	public MessagesApi.InactiveChats getInactiveChannels(ChannelsApi.GetInactiveChannels getInactiveChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb290c69, name = "ConvertToGigagroup")
	public Api.Updates convertToGigagroup(ChannelsApi.ConvertToGigagroup convertToGigagroup) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbeaedb94, name = "ViewSponsoredMessage")
	public Boolean viewSponsoredMessage(ChannelsApi.ViewSponsoredMessage viewSponsoredMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xec210fbf, name = "GetSponsoredMessages")
	public MessagesApi.SponsoredMessages getSponsoredMessages(ChannelsApi.GetSponsoredMessages getSponsoredMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xdc770ee, name = "GetSendAs")
	public ChannelsApi.SendAsPeers getSendAs(ChannelsApi.GetSendAs getSendAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x367544db, name = "DeleteParticipantHistory")
	public MessagesApi.AffectedHistory deleteParticipantHistory(ChannelsApi.DeleteParticipantHistory deleteParticipantHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe4cb9580, name = "ToggleJoinToSend")
	public Api.Updates toggleJoinToSend(ChannelsApi.ToggleJoinToSend toggleJoinToSend) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4c2985b6, name = "ToggleJoinRequest")
	public Api.Updates toggleJoinRequest(ChannelsApi.ToggleJoinRequest toggleJoinRequest) {
		return null;
	}
}