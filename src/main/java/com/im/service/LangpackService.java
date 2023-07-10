package com.im.service;

import com.im.lib.exception.RpcError;
import com.im.lib.net.Errors;
import com.im.lib.tl.TLRPC;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) 2022 Aix Lina. All rights reserved.
 *
 * @author: Aix Lina
 * @date: 2023-01-02
 */

@Service
public class LangpackService {

    private static final Logger logger = LoggerFactory.getLogger(LangpackService.class);

    public TLRPC.LangPackString[] getStrings(TLRPC.TL_langpack_getStrings getStrings) {
        if ("zh".equals(getStrings.lang_code)) {
            throw new RpcError(Errors.LANG_CODE_NOT_SUPPORTED);
        }
//        logger.info("{}", getStrings);
//        Api.LangPackString[] langPackStringArray = new Api.LangPackString[1];
//        Api.LangPackString langPackString = new Api.LangPackString();
//        langPackString.setKey("lang");
//        langPackString.setValue("en");
//        langPackStringArray[0] = langPackString;
//
//        return langPackStringArray;
        return null;
    }
}

