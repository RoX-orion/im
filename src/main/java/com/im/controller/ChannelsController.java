package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ChannelsController {

	@WebsocketHandlerMapping(value = -871347913, name = "ReadHistory")
	public Boolean readHistory(ChannelsApi.ReadHistory readHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2067661490, name = "DeleteMessages")
	public MessagesApi.AffectedMessages deleteMessages(ChannelsApi.DeleteMessages deleteMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = -196443371, name = "ReportSpam")
	public Boolean reportSpam(ChannelsApi.ReportSpam reportSpam) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1383294429, name = "GetMessages")
	public MessagesApi.Messages getMessages(ChannelsApi.GetMessages getMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2010044880, name = "GetParticipants")
	public ChannelsApi.ChannelParticipants getParticipants(ChannelsApi.GetParticipants getParticipants) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1599378234, name = "GetParticipant")
	public ChannelsApi.ChannelParticipant getParticipant(ChannelsApi.GetParticipant getParticipant) {
		return null;
	}

	@WebsocketHandlerMapping(value = 176122811, name = "GetChannels")
	public MessagesApi.Chats getChannels(ChannelsApi.GetChannels getChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 141781513, name = "GetFullChannel")
	public MessagesApi.ChatFull getFullChannel(ChannelsApi.GetFullChannel getFullChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1029681423, name = "CreateChannel")
	public Api.Updates createChannel(ChannelsApi.CreateChannel createChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = -751007486, name = "EditAdmin")
	public Api.Updates editAdmin(ChannelsApi.EditAdmin editAdmin) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1450044624, name = "EditTitle")
	public Api.Updates editTitle(ChannelsApi.EditTitle editTitle) {
		return null;
	}

	@WebsocketHandlerMapping(value = -248621111, name = "EditPhoto")
	public Api.Updates editPhoto(ChannelsApi.EditPhoto editPhoto) {
		return null;
	}

	@WebsocketHandlerMapping(value = 283557164, name = "CheckUsername")
	public Boolean checkUsername(ChannelsApi.CheckUsername checkUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 890549214, name = "UpdateUsername")
	public Boolean updateUsername(ChannelsApi.UpdateUsername updateUsername) {
		return null;
	}

	@WebsocketHandlerMapping(value = 615851205, name = "JoinChannel")
	public Api.Updates joinChannel(ChannelsApi.JoinChannel joinChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = -130635115, name = "LeaveChannel")
	public Api.Updates leaveChannel(ChannelsApi.LeaveChannel leaveChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = 429865580, name = "InviteToChannel")
	public Api.Updates inviteToChannel(ChannelsApi.InviteToChannel inviteToChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1072619549, name = "DeleteChannel")
	public Api.Updates deleteChannel(ChannelsApi.DeleteChannel deleteChannel) {
		return null;
	}

	@WebsocketHandlerMapping(value = -432034325, name = "ExportMessageLink")
	public Api.ExportedMessageLink exportMessageLink(ChannelsApi.ExportMessageLink exportMessageLink) {
		return null;
	}

	@WebsocketHandlerMapping(value = 527021574, name = "ToggleSignatures")
	public Api.Updates toggleSignatures(ChannelsApi.ToggleSignatures toggleSignatures) {
		return null;
	}

	@WebsocketHandlerMapping(value = -122669393, name = "GetAdminedPublicChannels")
	public MessagesApi.Chats getAdminedPublicChannels(ChannelsApi.GetAdminedPublicChannels getAdminedPublicChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1763259007, name = "EditBanned")
	public Api.Updates editBanned(ChannelsApi.EditBanned editBanned) {
		return null;
	}

	@WebsocketHandlerMapping(value = 870184064, name = "GetAdminLog")
	public ChannelsApi.AdminLogResults getAdminLog(ChannelsApi.GetAdminLog getAdminLog) {
		return null;
	}

	@WebsocketHandlerMapping(value = -359881479, name = "SetStickers")
	public Boolean setStickers(ChannelsApi.SetStickers setStickers) {
		return null;
	}

	@WebsocketHandlerMapping(value = -357180360, name = "ReadMessageContents")
	public Boolean readMessageContents(ChannelsApi.ReadMessageContents readMessageContents) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1683319225, name = "DeleteHistory")
	public Api.Updates deleteHistory(ChannelsApi.DeleteHistory deleteHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = -356796084, name = "TogglePreHistoryHidden")
	public Api.Updates togglePreHistoryHidden(ChannelsApi.TogglePreHistoryHidden togglePreHistoryHidden) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2092831552, name = "GetLeftChannels")
	public MessagesApi.Chats getLeftChannels(ChannelsApi.GetLeftChannels getLeftChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = -170208392, name = "GetGroupsForDiscussion")
	public MessagesApi.Chats getGroupsForDiscussion(ChannelsApi.GetGroupsForDiscussion getGroupsForDiscussion) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1079520178, name = "SetDiscussionGroup")
	public Boolean setDiscussionGroup(ChannelsApi.SetDiscussionGroup setDiscussionGroup) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1892102881, name = "EditCreator")
	public Api.Updates editCreator(ChannelsApi.EditCreator editCreator) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1491484525, name = "EditLocation")
	public Boolean editLocation(ChannelsApi.EditLocation editLocation) {
		return null;
	}

	@WebsocketHandlerMapping(value = -304832784, name = "ToggleSlowMode")
	public Api.Updates toggleSlowMode(ChannelsApi.ToggleSlowMode toggleSlowMode) {
		return null;
	}

	@WebsocketHandlerMapping(value = 300429806, name = "GetInactiveChannels")
	public MessagesApi.InactiveChats getInactiveChannels(ChannelsApi.GetInactiveChannels getInactiveChannels) {
		return null;
	}

	@WebsocketHandlerMapping(value = 187239529, name = "ConvertToGigagroup")
	public Api.Updates convertToGigagroup(ChannelsApi.ConvertToGigagroup convertToGigagroup) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1095836780, name = "ViewSponsoredMessage")
	public Boolean viewSponsoredMessage(ChannelsApi.ViewSponsoredMessage viewSponsoredMessage) {
		return null;
	}

	@WebsocketHandlerMapping(value = -333377601, name = "GetSponsoredMessages")
	public MessagesApi.SponsoredMessages getSponsoredMessages(ChannelsApi.GetSponsoredMessages getSponsoredMessages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 231174382, name = "GetSendAs")
	public ChannelsApi.SendAsPeers getSendAs(ChannelsApi.GetSendAs getSendAs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 913655003, name = "DeleteParticipantHistory")
	public MessagesApi.AffectedHistory deleteParticipantHistory(ChannelsApi.DeleteParticipantHistory deleteParticipantHistory) {
		return null;
	}

	@WebsocketHandlerMapping(value = -456419968, name = "ToggleJoinToSend")
	public Api.Updates toggleJoinToSend(ChannelsApi.ToggleJoinToSend toggleJoinToSend) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1277789622, name = "ToggleJoinRequest")
	public Api.Updates toggleJoinRequest(ChannelsApi.ToggleJoinRequest toggleJoinRequest) {
		return null;
	}
}