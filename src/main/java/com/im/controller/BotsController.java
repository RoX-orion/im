package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class BotsController {

	@WebsocketHandlerMapping(value = -1440257555, name = "SendCustomRequest")
	public Api.DataJSON sendCustomRequest(BotsApi.SendCustomRequest sendCustomRequest) {
		return null;
	}

	@WebsocketHandlerMapping(value = -434028723, name = "AnswerWebhookJSONQuery")
	public Boolean answerWebhookJSONQuery(BotsApi.AnswerWebhookJSONQuery answerWebhookJSONQuery) {
		return null;
	}

	@WebsocketHandlerMapping(value = 85399130, name = "SetBotCommands")
	public Boolean setBotCommands(BotsApi.SetBotCommands setBotCommands) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1032708345, name = "ResetBotCommands")
	public Boolean resetBotCommands(BotsApi.ResetBotCommands resetBotCommands) {
		return null;
	}

	@WebsocketHandlerMapping(value = -481554986, name = "GetBotCommands")
	public Api.BotCommand[] getBotCommands(BotsApi.GetBotCommands getBotCommands) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1157944655, name = "SetBotMenuButton")
	public Boolean setBotMenuButton(BotsApi.SetBotMenuButton setBotMenuButton) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1671369944, name = "GetBotMenuButton")
	public Api.BotMenuButton getBotMenuButton(BotsApi.GetBotMenuButton getBotMenuButton) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2021942497, name = "SetBotBroadcastDefaultAdminRights")
	public Boolean setBotBroadcastDefaultAdminRights(BotsApi.SetBotBroadcastDefaultAdminRights setBotBroadcastDefaultAdminRights) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1839281686, name = "SetBotGroupDefaultAdminRights")
	public Boolean setBotGroupDefaultAdminRights(BotsApi.SetBotGroupDefaultAdminRights setBotGroupDefaultAdminRights) {
		return null;
	}
}