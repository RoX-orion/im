package com.im.config;

//import com.im.entity.output.ApiResult;
//import com.im.exception.NotLoginException;
//import com.im.lib.exception.RequestIncompleteException;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.web.HttpRequestMethodNotSupportedException;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * @author RoX-orion
 * @date 2021-05-30
 * @since 1.0.0
 */

//@RestControllerAdvice
public class HandleGlobalException {

//    @ResponseBody
//    @ExceptionHandler(NotLoginException.class)
//    public ApiResult notLoginException(NotLoginException notLoginException) {
//        return ApiResult.expired(notLoginException.getMessage());
//    }
//
//    @ResponseBody
//    @ExceptionHandler(RequestIncompleteException.class)
//    public ApiResult notLoginException(RequestIncompleteException e) {
//        return ApiResult.expired(e.getMessage());
//    }
//
//    @ResponseBody
//    @ExceptionHandler(HttpMessageNotReadableException.class)
//    public ApiResult error(HttpMessageNotReadableException e) {
//        e.printStackTrace();
//        return ApiResult.build(500, "请求参数异常！");
//    }
//
//    @ResponseBody
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    public ApiResult error(MethodArgumentNotValidException e) {
//        e.printStackTrace();
//        return ApiResult.build(500, "请求参数异常！");
//    }
//
//    @ResponseBody
//    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
//    public ApiResult error(HttpRequestMethodNotSupportedException e) {
//        e.printStackTrace();
//        return ApiResult.build(500, "请求方法错误！");
//    }
//
//    @ResponseBody
//    @ExceptionHandler(Exception.class)
//    public ApiResult error(Exception e) {
//        e.printStackTrace();
//
//        return ApiResult.error();
//    }
}
