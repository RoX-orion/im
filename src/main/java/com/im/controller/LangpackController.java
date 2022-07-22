package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class LangpackController {

	@WebsocketHandlerMapping(value = 4075959050L, name = "GetLangPack")
	public Api.LangPackDifference getLangPack(LangpackApi.GetLangPack getLangPack) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4025104387L, name = "GetStrings")
	public Api.LangPackString[] getStrings(LangpackApi.GetStrings getStrings) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3449309861L, name = "GetDifference")
	public Api.LangPackDifference getDifference(LangpackApi.GetDifference getDifference) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1120311183L, name = "GetLanguages")
	public Api.LangPackLanguage[] getLanguages(LangpackApi.GetLanguages getLanguages) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1784243458L, name = "GetLanguage")
	public Api.LangPackLanguage getLanguage(LangpackApi.GetLanguage getLanguage) {
		return null;
	}
}