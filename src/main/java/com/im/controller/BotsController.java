package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BotsController {

	@WebsocketHandlerMapping(value = 2854709741L, name = "SendCustomRequest")
	public Api.DataJSON sendCustomRequest(BotsApi.SendCustomRequest sendCustomRequest) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3860938573L, name = "AnswerWebhookJSONQuery")
	public Boolean answerWebhookJSONQuery(BotsApi.AnswerWebhookJSONQuery answerWebhookJSONQuery) {
		return null;
	}

	@WebsocketHandlerMapping(value = 85399130L, name = "SetBotCommands")
	public Boolean setBotCommands(BotsApi.SetBotCommands setBotCommands) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1032708345L, name = "ResetBotCommands")
	public Boolean resetBotCommands(BotsApi.ResetBotCommands resetBotCommands) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3813412310L, name = "GetBotCommands")
	public Api.BotCommand[] getBotCommands(BotsApi.GetBotCommands getBotCommands) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1157944655L, name = "SetBotMenuButton")
	public Boolean setBotMenuButton(BotsApi.SetBotMenuButton setBotMenuButton) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2623597352L, name = "GetBotMenuButton")
	public Api.BotMenuButton getBotMenuButton(BotsApi.GetBotMenuButton getBotMenuButton) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2021942497L, name = "SetBotBroadcastDefaultAdminRights")
	public Boolean setBotBroadcastDefaultAdminRights(BotsApi.SetBotBroadcastDefaultAdminRights setBotBroadcastDefaultAdminRights) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2455685610L, name = "SetBotGroupDefaultAdminRights")
	public Boolean setBotGroupDefaultAdminRights(BotsApi.SetBotGroupDefaultAdminRights setBotGroupDefaultAdminRights) {
		return null;
	}
}