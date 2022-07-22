package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UpdatesController {

	@WebsocketHandlerMapping(value = 3990128682L, name = "GetState")
	public UpdatesApi.State getState(UpdatesApi.GetState getState) {
		return null;
	}

	@WebsocketHandlerMapping(value = 630429265L, name = "GetDifference")
	public UpdatesApi.Difference getDifference(UpdatesApi.GetDifference getDifference) {
		return null;
	}

	@WebsocketHandlerMapping(value = 51854712L, name = "GetChannelDifference")
	public UpdatesApi.ChannelDifference getChannelDifference(UpdatesApi.GetChannelDifference getChannelDifference) {
		return null;
	}
}