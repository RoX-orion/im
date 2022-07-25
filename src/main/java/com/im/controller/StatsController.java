package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StatsController {

	@WebsocketHandlerMapping(value = -1421720550, name = "GetBroadcastStats")
	public StatsApi.BroadcastStats getBroadcastStats(StatsApi.GetBroadcastStats getBroadcastStats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1646092192, name = "LoadAsyncGraph")
	public Api.StatsGraph loadAsyncGraph(StatsApi.LoadAsyncGraph loadAsyncGraph) {
		return null;
	}

	@WebsocketHandlerMapping(value = -589330937, name = "GetMegagroupStats")
	public StatsApi.MegagroupStats getMegagroupStats(StatsApi.GetMegagroupStats getMegagroupStats) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1445996571, name = "GetMessagePublicForwards")
	public MessagesApi.Messages getMessagePublicForwards(StatsApi.GetMessagePublicForwards getMessagePublicForwards) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1226791947, name = "GetMessageStats")
	public StatsApi.MessageStats getMessageStats(StatsApi.GetMessageStats getMessageStats) {
		return null;
	}
}