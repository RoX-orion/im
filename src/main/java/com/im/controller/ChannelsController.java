package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ChannelsController {

	@WebsocketHandlerMapping(value = 3423619383L, name = "ReadHistory")
	public Boolean readHistory(ChannelsApi.ReadHistory readHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2227305806L, name = "DeleteMessages")
	public MessagesApi.AffectedMessages deleteMessages(ChannelsApi.DeleteMessages deleteMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4098523925L, name = "ReportSpam")
	public Boolean reportSpam(ChannelsApi.ReportSpam reportSpam) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2911672867L, name = "GetMessages")
	public MessagesApi.Messages getMessages(ChannelsApi.GetMessages getMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2010044880L, name = "GetParticipants")
	public ChannelsApi.ChannelParticipants getParticipants(ChannelsApi.GetParticipants getParticipants) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2695589062L, name = "GetParticipant")
	public ChannelsApi.ChannelParticipant getParticipant(ChannelsApi.GetParticipant getParticipant) {
		return null;
	}

	@WebsocketHandlerMapping(value = 176122811L, name = "GetChannels")
	public MessagesApi.Chats getChannels(ChannelsApi.GetChannels getChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 141781513L, name = "GetFullChannel")
	public MessagesApi.ChatFull getFullChannel(ChannelsApi.GetFullChannel getFullChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1029681423L, name = "CreateChannel")
	public Api.Updates createChannel(ChannelsApi.CreateChannel createChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3543959810L, name = "EditAdmin")
	public Api.Updates editAdmin(ChannelsApi.EditAdmin editAdmin) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1450044624L, name = "EditTitle")
	public Api.Updates editTitle(ChannelsApi.EditTitle editTitle) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4046346185L, name = "EditPhoto")
	public Api.Updates editPhoto(ChannelsApi.EditPhoto editPhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = 283557164L, name = "CheckUsername")
	public Boolean checkUsername(ChannelsApi.CheckUsername checkUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 890549214L, name = "UpdateUsername")
	public Boolean updateUsername(ChannelsApi.UpdateUsername updateUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 615851205L, name = "JoinChannel")
	public Api.Updates joinChannel(ChannelsApi.JoinChannel joinChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4164332181L, name = "LeaveChannel")
	public Api.Updates leaveChannel(ChannelsApi.LeaveChannel leaveChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 429865580L, name = "InviteToChannel")
	public Api.Updates inviteToChannel(ChannelsApi.InviteToChannel inviteToChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3222347747L, name = "DeleteChannel")
	public Api.Updates deleteChannel(ChannelsApi.DeleteChannel deleteChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3862932971L, name = "ExportMessageLink")
	public Api.ExportedMessageLink exportMessageLink(ChannelsApi.ExportMessageLink exportMessageLink) {
		return null;
	}

	@WebsocketHandlerMapping(value = 527021574L, name = "ToggleSignatures")
	public Api.Updates toggleSignatures(ChannelsApi.ToggleSignatures toggleSignatures) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4172297903L, name = "GetAdminedPublicChannels")
	public MessagesApi.Chats getAdminedPublicChannels(ChannelsApi.GetAdminedPublicChannels getAdminedPublicChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2531708289L, name = "EditBanned")
	public Api.Updates editBanned(ChannelsApi.EditBanned editBanned) {
		return null;
	}

	@WebsocketHandlerMapping(value = 870184064L, name = "GetAdminLog")
	public ChannelsApi.AdminLogResults getAdminLog(ChannelsApi.GetAdminLog getAdminLog) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3935085817L, name = "SetStickers")
	public Boolean setStickers(ChannelsApi.SetStickers setStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3937786936L, name = "ReadMessageContents")
	public Boolean readMessageContents(ChannelsApi.ReadMessageContents readMessageContents) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2611648071L, name = "DeleteHistory")
	public Api.Updates deleteHistory(ChannelsApi.DeleteHistory deleteHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3938171212L, name = "TogglePreHistoryHidden")
	public Api.Updates togglePreHistoryHidden(ChannelsApi.TogglePreHistoryHidden togglePreHistoryHidden) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2202135744L, name = "GetLeftChannels")
	public MessagesApi.Chats getLeftChannels(ChannelsApi.GetLeftChannels getLeftChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4124758904L, name = "GetGroupsForDiscussion")
	public MessagesApi.Chats getGroupsForDiscussion(ChannelsApi.GetGroupsForDiscussion getGroupsForDiscussion) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1079520178L, name = "SetDiscussionGroup")
	public Boolean setDiscussionGroup(ChannelsApi.SetDiscussionGroup setDiscussionGroup) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2402864415L, name = "EditCreator")
	public Api.Updates editCreator(ChannelsApi.EditCreator editCreator) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1491484525L, name = "EditLocation")
	public Boolean editLocation(ChannelsApi.EditLocation editLocation) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3990134512L, name = "ToggleSlowMode")
	public Api.Updates toggleSlowMode(ChannelsApi.ToggleSlowMode toggleSlowMode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 300429806L, name = "GetInactiveChannels")
	public MessagesApi.InactiveChats getInactiveChannels(ChannelsApi.GetInactiveChannels getInactiveChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 187239529L, name = "ConvertToGigagroup")
	public Api.Updates convertToGigagroup(ChannelsApi.ConvertToGigagroup convertToGigagroup) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3199130516L, name = "ViewSponsoredMessage")
	public Boolean viewSponsoredMessage(ChannelsApi.ViewSponsoredMessage viewSponsoredMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3961589695L, name = "GetSponsoredMessages")
	public MessagesApi.SponsoredMessages getSponsoredMessages(ChannelsApi.GetSponsoredMessages getSponsoredMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 231174382L, name = "GetSendAs")
	public ChannelsApi.SendAsPeers getSendAs(ChannelsApi.GetSendAs getSendAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 913655003L, name = "DeleteParticipantHistory")
	public MessagesApi.AffectedHistory deleteParticipantHistory(ChannelsApi.DeleteParticipantHistory deleteParticipantHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3838547328L, name = "ToggleJoinToSend")
	public Api.Updates toggleJoinToSend(ChannelsApi.ToggleJoinToSend toggleJoinToSend) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1277789622L, name = "ToggleJoinRequest")
	public Api.Updates toggleJoinRequest(ChannelsApi.ToggleJoinRequest toggleJoinRequest) {
		return null;
	}
}