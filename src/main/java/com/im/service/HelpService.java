package com.im.service;

import com.im.entity.Country;
import com.im.lib.Helpers;
import com.im.lib.tl.TLRPC;
import com.im.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-01
 */

@Service
public class HelpService {

    private final CountryMapper countryMapper;

    @Autowired
    public HelpService(final CountryMapper countryMapper) {
        this.countryMapper = countryMapper;
    }

    public TLRPC.help_CountriesList getCountriesList(TLRPC.TL_help_getCountriesList getCountriesList) {
        TLRPC.TL_help_countriesList countries = new TLRPC.TL_help_countriesList();
        List<Country> countryList = countryMapper.getCountryList();
        List<Long> ids = countryList.stream().map(e -> (long) e.getCountryId()).toList();
        long hash = Helpers.getHash(ids);
        if (hash == getCountriesList.hash) {
            return new TLRPC.TL_help_countriesListNotModified();
        }
        countries.countries = countryList.stream().map(e -> {
            TLRPC.TL_help_country country = new TLRPC.TL_help_country();
            country.hidden = e.isHidden();
            country.iso2 = e.getIso2();
            country.default_name = e.getDefaultName();
            country.name = e.getName();
            TLRPC.TL_help_countryCode countryCode = new TLRPC.TL_help_countryCode();
            countryCode.country_code = e.getCountryCode();
            countryCode.prefixes = StringUtils.hasText(e.getPrefixes()) ? Helpers.parseList(e.getPrefixes(), String.class) : null;
            countryCode.patterns = StringUtils.hasText(e.getPatterns()) ? Helpers.parseList(e.getPatterns(), String.class) : null;
            country.country_codes = List.of(countryCode);

            return country;
        }).toList();
        countries.hash = (int) hash;

        return countries;
    }

    public TLRPC.TL_nearestDc getNearestDc() {
        TLRPC.TL_nearestDc nearestDc = new TLRPC.TL_nearestDc();
        nearestDc.country = "CN";
        nearestDc.this_dc = 2;
        nearestDc.nearest_dc = 2;

        return nearestDc;
    }
}
