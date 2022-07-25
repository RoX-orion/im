package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class UpdatesController {

	@WebsocketHandlerMapping(value = -304838614, name = "GetState")
	public UpdatesApi.State getState(UpdatesApi.GetState getState) {
		return null;
	}

	@WebsocketHandlerMapping(value = 630429265, name = "GetDifference")
	public UpdatesApi.Difference getDifference(UpdatesApi.GetDifference getDifference) {
		return null;
	}

	@WebsocketHandlerMapping(value = 51854712, name = "GetChannelDifference")
	public UpdatesApi.ChannelDifference getChannelDifference(UpdatesApi.GetChannelDifference getChannelDifference) {
		return null;
	}
}