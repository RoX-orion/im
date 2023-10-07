package com.im.controller;

import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.annotation.WebsocketRequestParam;
import com.im.lib.tl.TLRPC;
import com.im.service.UpdatesService;

@WebsocketHandler
public class UpdatesController {

	private final UpdatesService updatesService;

	public UpdatesController(final UpdatesService updatesService) {
		this.updatesService = updatesService;
	}

	@WebsocketHandlerMapping(value = 0xedd4882a, name = "GetState")
	public TLRPC.TL_updates_state getState(@WebsocketRequestParam("authKeyId") long authKeyId) {
		return updatesService.getState(authKeyId);
	}
//
//	@WebsocketHandlerMapping(value = 0x25939651, name = "GetDifference")
//	public UpdatesApi.Difference getDifference(UpdatesApi.GetDifference getDifference) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x3173d78, name = "GetChannelDifference")
//	public UpdatesApi.ChannelDifference getChannelDifference(UpdatesApi.GetChannelDifference getChannelDifference) {
//		return null;
//	}
}
