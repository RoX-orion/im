package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class LangpackController {

	@WebsocketHandlerMapping(value = -219008246, name = "GetLangPack")
	public Api.LangPackDifference getLangPack(LangpackApi.GetLangPack getLangPack) {
		return null;
	}

	@WebsocketHandlerMapping(value = -269862909, name = "GetStrings")
	public Api.LangPackString[] getStrings(LangpackApi.GetStrings getStrings) {
		return null;
	}

	@WebsocketHandlerMapping(value = -845657435, name = "GetDifference")
	public Api.LangPackDifference getDifference(LangpackApi.GetDifference getDifference) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1120311183, name = "GetLanguages")
	public Api.LangPackLanguage[] getLanguages(LangpackApi.GetLanguages getLanguages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1784243458, name = "GetLanguage")
	public Api.LangPackLanguage getLanguage(LangpackApi.GetLanguage getLanguage) {
		return null;
	}
}