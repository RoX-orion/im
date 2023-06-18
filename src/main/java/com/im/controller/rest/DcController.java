package com.im.controller.rest;

import com.im.entity.output.ApiResult;
import com.im.lib.tl.TLRPC;
import com.im.service.DcService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-18
 */

@RestController
@RequestMapping("dc")
public class DcController {

    private final DcService dcService;

    public DcController(final DcService dcService) {
        this.dcService = dcService;
    }

    @RequestMapping(value = "dc-option", method = RequestMethod.POST)
    public ApiResult addDcOptions(@RequestBody TLRPC.TL_dcOption dcOption) {
        dcService.addDcOption(dcOption);

        return ApiResult.ok();
    }
}
