package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StickersController {

	@WebsocketHandlerMapping(value = 2418125671L, name = "CreateStickerSet")
	public MessagesApi.StickerSet createStickerSet(StickersApi.CreateStickerSet createStickerSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4151709521L, name = "RemoveStickerFromSet")
	public MessagesApi.StickerSet removeStickerFromSet(StickersApi.RemoveStickerFromSet removeStickerFromSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4290172106L, name = "ChangeStickerPosition")
	public MessagesApi.StickerSet changeStickerPosition(StickersApi.ChangeStickerPosition changeStickerPosition) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2253651646L, name = "AddStickerToSet")
	public MessagesApi.StickerSet addStickerToSet(StickersApi.AddStickerToSet addStickerToSet) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2587250224L, name = "SetStickerSetThumb")
	public MessagesApi.StickerSet setStickerSetThumb(StickersApi.SetStickerSetThumb setStickerSetThumb) {
		return null;
	}

	@WebsocketHandlerMapping(value = 676017721L, name = "CheckShortName")
	public Boolean checkShortName(StickersApi.CheckShortName checkShortName) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1303364867L, name = "SuggestShortName")
	public StickersApi.SuggestedShortName suggestShortName(StickersApi.SuggestShortName suggestShortName) {
		return null;
	}
}