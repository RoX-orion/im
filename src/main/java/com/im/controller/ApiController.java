package com.im.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.im.api.Api;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.annotation.WebsocketRequestParam;
import com.im.lib.net.TLRPC;
import com.im.service.ApiService;
import io.netty.channel.Channel;
import jakarta.annotation.Resource;

import java.math.BigInteger;

@WebsocketHandler
public class ApiController {

	@Resource
	private ApiService apiService;

	@WebsocketHandlerMapping(value = 0x60469778, name = "ReqPq")
	public Api.ResPQ reqPq(Api.ReqPq reqPq) {
		return apiService.reqPq(reqPq);
	}

	@WebsocketHandlerMapping(value = 0xbe7e8ef1, name = "ReqPqMulti")
	public Api.ResPQ reqPqMulti(TLRPC.TL_ReqPqMulti reqPqMulti) throws JsonProcessingException {
		return apiService.reqPqMulti(reqPqMulti);
	}

	@WebsocketHandlerMapping(value = 0x51b410fd, name = "ReqPqMultiNew")
	public Api.ResPQ reqPqMultiNew(Api.ReqPqMultiNew reqPqMultiNew) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd712e4be, name = "ReqDHParams")
	public Api.TypeServer_DH_Params reqDHParams(Api.ReqDHParams reqDHParams) throws Exception {
		return apiService.reqDHParams(reqDHParams);
	}

	@WebsocketHandlerMapping(value = 0xf5045f1f, name = "SetClientDHParams")
	public Api.TypeSet_client_DH_params_answer setClientDHParams(Api.SetClientDHParams setClientDHParams,
	                                                             Channel channel) {
		return apiService.setClientDHParams(setClientDHParams, channel);
	}

	@WebsocketHandlerMapping(value = 0xd1435160, name = "DestroyAuthKey")
	public Api.TypeDestroyAuthKeyRes destroyAuthKey(Api.DestroyAuthKey destroyAuthKey) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x58e4a740, name = "RpcDropAnswer")
	public Api.TypeRpcDropAnswer rpcDropAnswer(Api.RpcDropAnswer rpcDropAnswer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb921bd04, name = "GetFutureSalts")
	public Api.FutureSalts getFutureSalts(Api.GetFutureSalts getFutureSalts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x7abe77ec, name = "Ping")
	public Api.Pong ping(Api.Ping ping) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf3427b8c, name = "PingDelayDisconnect")
	public Api.Pong pingDelayDisconnect(Api.PingDelayDisconnect pingDelayDisconnect,
	                                    @WebsocketRequestParam("msgId") BigInteger msgId) {
		return apiService.pingDelayDisconnect(pingDelayDisconnect, msgId);
	}

	@WebsocketHandlerMapping(value = 0xe7512126, name = "DestroySession")
	public Api.TypeDestroySessionRes destroySession(Api.DestroySession destroySession) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xda9b0d0d, name = "invokeWithLayer")
	public Object invokeWithLayer(Api.InvokeWithLayer invokeWithLayer) {
		return apiService.invokeWithLayer(invokeWithLayer);
	}
}
