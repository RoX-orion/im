package com.im.controller;

import com.im.api.Api;
import com.im.api.MessagesApi;
import com.im.api.StatsApi;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class StatsController {

	@WebsocketHandlerMapping(value = 0xab42441a, name = "GetBroadcastStats")
	public StatsApi.BroadcastStats getBroadcastStats(StatsApi.GetBroadcastStats getBroadcastStats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x621d5fa0, name = "LoadAsyncGraph")
	public Api.StatsGraph loadAsyncGraph(StatsApi.LoadAsyncGraph loadAsyncGraph) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xdcdf8607, name = "GetMegagroupStats")
	public StatsApi.MegagroupStats getMegagroupStats(StatsApi.GetMegagroupStats getMegagroupStats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x5630281b, name = "GetMessagePublicForwards")
	public MessagesApi.Messages getMessagePublicForwards(StatsApi.GetMessagePublicForwards getMessagePublicForwards) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb6e0a3f5, name = "GetMessageStats")
	public StatsApi.MessageStats getMessageStats(StatsApi.GetMessageStats getMessageStats) {
		return null;
	}
}
