package com.im.service;

import com.im.api.Api;
import com.im.api.LangpackApi;
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

    public Api.TypeLangPackString[] getStrings(LangpackApi.GetStrings getStrings) {
        logger.info("{}", getStrings);
        Api.LangPackString[] langPackStringArray = new Api.LangPackString[1];
        Api.LangPackString langPackString = new Api.LangPackString();
        langPackString.setKey("lang");
        langPackString.setValue("en");
        langPackStringArray[0] = langPackString;

        return langPackStringArray;
    }
}
