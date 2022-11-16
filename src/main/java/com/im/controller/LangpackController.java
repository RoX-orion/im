package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class LangpackController {

	@WebsocketHandlerMapping(value = 0xf2f2330a, name = "GetLangPack")
	public Api.LangPackDifference getLangPack(LangpackApi.GetLangPack getLangPack) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xefea3803, name = "GetStrings")
	public Api.LangPackString[] getStrings(LangpackApi.GetStrings getStrings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xcd984aa5, name = "GetDifference")
	public Api.LangPackDifference getDifference(LangpackApi.GetDifference getDifference) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x42c6978f, name = "GetLanguages")
	public Api.LangPackLanguage[] getLanguages(LangpackApi.GetLanguages getLanguages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x6a596502, name = "GetLanguage")
	public Api.LangPackLanguage getLanguage(LangpackApi.GetLanguage getLanguage) {
		return null;
	}
}