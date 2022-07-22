package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class FoldersController {

	@WebsocketHandlerMapping(value = 1749536939L, name = "EditPeerFolders")
	public Api.Updates editPeerFolders(FoldersApi.EditPeerFolders editPeerFolders) {
		return null;
	}

	@WebsocketHandlerMapping(value = 472471681L, name = "DeleteFolder")
	public Api.Updates deleteFolder(FoldersApi.DeleteFolder deleteFolder) {
		return null;
	}
}