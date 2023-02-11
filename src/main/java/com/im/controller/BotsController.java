package com.im.controller;

import com.im.api.Api;
import com.im.api.BotsApi;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class BotsController {

	@WebsocketHandlerMapping(value = 0xaa2769ed, name = "SendCustomRequest")
	public Api.DataJSON sendCustomRequest(BotsApi.SendCustomRequest sendCustomRequest) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe6213f4d, name = "AnswerWebhookJSONQuery")
	public Boolean answerWebhookJSONQuery(BotsApi.AnswerWebhookJSONQuery answerWebhookJSONQuery) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x517165a, name = "SetBotCommands")
	public Boolean setBotCommands(BotsApi.SetBotCommands setBotCommands) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3d8de0f9, name = "ResetBotCommands")
	public Boolean resetBotCommands(BotsApi.ResetBotCommands resetBotCommands) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe34c0dd6, name = "GetBotCommands")
	public Api.BotCommand[] getBotCommands(BotsApi.GetBotCommands getBotCommands) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4504d54f, name = "SetBotMenuButton")
	public Boolean setBotMenuButton(BotsApi.SetBotMenuButton setBotMenuButton) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9c60eb28, name = "GetBotMenuButton")
	public Api.BotMenuButton getBotMenuButton(BotsApi.GetBotMenuButton getBotMenuButton) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x788464e1, name = "SetBotBroadcastDefaultAdminRights")
	public Boolean setBotBroadcastDefaultAdminRights(BotsApi.SetBotBroadcastDefaultAdminRights setBotBroadcastDefaultAdminRights) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x925ec9ea, name = "SetBotGroupDefaultAdminRights")
	public Boolean setBotGroupDefaultAdminRights(BotsApi.SetBotGroupDefaultAdminRights setBotGroupDefaultAdminRights) {
		return null;
	}
}
