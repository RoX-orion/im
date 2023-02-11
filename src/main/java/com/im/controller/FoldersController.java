package com.im.controller;

import com.im.api.Api;
import com.im.api.FoldersApi;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class FoldersController {

	@WebsocketHandlerMapping(value = 0x6847d0ab, name = "EditPeerFolders")
	public Api.Updates editPeerFolders(FoldersApi.EditPeerFolders editPeerFolders) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x1c295881, name = "DeleteFolder")
	public Api.Updates deleteFolder(FoldersApi.DeleteFolder deleteFolder) {
		return null;
	}
}
