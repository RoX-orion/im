package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StickersController {

	@WebsocketHandlerMapping(value = -1876841625, name = "CreateStickerSet")
	public MessagesApi.StickerSet createStickerSet(StickersApi.CreateStickerSet createStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = -143257775, name = "RemoveStickerFromSet")
	public MessagesApi.StickerSet removeStickerFromSet(StickersApi.RemoveStickerFromSet removeStickerFromSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = -4795190, name = "ChangeStickerPosition")
	public MessagesApi.StickerSet changeStickerPosition(StickersApi.ChangeStickerPosition changeStickerPosition) {
		return null;
	}

	@WebsocketHandlerMapping(value = -2041315650, name = "AddStickerToSet")
	public MessagesApi.StickerSet addStickerToSet(StickersApi.AddStickerToSet addStickerToSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1707717072, name = "SetStickerSetThumb")
	public MessagesApi.StickerSet setStickerSetThumb(StickersApi.SetStickerSetThumb setStickerSetThumb) {
		return null;
	}

	@WebsocketHandlerMapping(value = 676017721, name = "CheckShortName")
	public Boolean checkShortName(StickersApi.CheckShortName checkShortName) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1303364867, name = "SuggestShortName")
	public StickersApi.SuggestedShortName suggestShortName(StickersApi.SuggestShortName suggestShortName) {
		return null;
	}
}