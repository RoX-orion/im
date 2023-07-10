package com.im.controller;

import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.tl.TLRPC;
import com.im.service.LangpackService;
import jakarta.annotation.Resource;

@WebsocketHandler
public class LangpackController {

	@Resource
	private LangpackService langpackService;

	@WebsocketHandlerMapping(value = 0xf2f2330a, name = "GetLangPack")
	public TLRPC.TL_langPackDifference getLangPack(TLRPC.TL_langpack_getLangPack getLangPack) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xefea3803, name = "GetStrings")
	public TLRPC.LangPackString[] getStrings(TLRPC.TL_langpack_getStrings getStrings) {
		return langpackService.getStrings(getStrings);
	}
//
//	@WebsocketHandlerMapping(value = 0xcd984aa5, name = "GetDifference")
//	public TLRPC.TL_langPackDifference getDifference(LangpackApi.GetDifference getDifference) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x42c6978f, name = "GetLanguages")
//	public TLRPC.TL_langPackLanguage[] getLanguages(LangpackApi.GetLanguages getLanguages) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x6a596502, name = "GetLanguage")
//	public TLRPC.TL_langPackLanguage getLanguage(LangpackApi.GetLanguage getLanguage) {
//		return null;
//	}
}
