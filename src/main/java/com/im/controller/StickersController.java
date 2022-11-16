package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class StickersController {

	@WebsocketHandlerMapping(value = 0x9021ab67, name = "CreateStickerSet")
	public MessagesApi.StickerSet createStickerSet(StickersApi.CreateStickerSet createStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf7760f51, name = "RemoveStickerFromSet")
	public MessagesApi.StickerSet removeStickerFromSet(StickersApi.RemoveStickerFromSet removeStickerFromSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xffb6d4ca, name = "ChangeStickerPosition")
	public MessagesApi.StickerSet changeStickerPosition(StickersApi.ChangeStickerPosition changeStickerPosition) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x8653febe, name = "AddStickerToSet")
	public MessagesApi.StickerSet addStickerToSet(StickersApi.AddStickerToSet addStickerToSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x9a364e30, name = "SetStickerSetThumb")
	public MessagesApi.StickerSet setStickerSetThumb(StickersApi.SetStickerSetThumb setStickerSetThumb) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x284b3639, name = "CheckShortName")
	public Boolean checkShortName(StickersApi.CheckShortName checkShortName) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4dafc503, name = "SuggestShortName")
	public StickersApi.SuggestedShortName suggestShortName(StickersApi.SuggestShortName suggestShortName) {
		return null;
	}
}