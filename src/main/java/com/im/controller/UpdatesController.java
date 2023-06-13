package com.im.controller;

import com.im.api.UpdatesApi;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.service.UpdatesService;
import jakarta.annotation.Resource;

@WebsocketHandler
public class UpdatesController {

	@Resource
	private UpdatesService updatesService;

	@WebsocketHandlerMapping(value = 0xedd4882a, name = "GetState")
	public UpdatesApi.State getState(UpdatesApi.GetState getState) {
		return updatesService.getState(getState);
	}

	@WebsocketHandlerMapping(value = 0x25939651, name = "GetDifference")
	public UpdatesApi.Difference getDifference(UpdatesApi.GetDifference getDifference) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3173d78, name = "GetChannelDifference")
	public UpdatesApi.ChannelDifference getChannelDifference(UpdatesApi.GetChannelDifference getChannelDifference) {
		return null;
	}
}
