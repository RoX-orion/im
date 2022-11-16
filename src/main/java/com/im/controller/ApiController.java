package com.im.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.service.ApiService;

import javax.annotation.Resource;

@WebsocketHandler
public class ApiController {

	@Resource
	private ApiService apiService;

	@WebsocketHandlerMapping(value = 0x60469778, name = "ReqPq")
	public Api.ResPQ reqPq(Api.ReqPq reqPq) {
		return apiService.reqPq(reqPq);
	}

	@WebsocketHandlerMapping(value = 0xbe7e8ef1, name = "ReqPqMulti")
	public Api.ResPQ reqPqMulti(Api.ReqPqMulti reqPqMulti) throws JsonProcessingException {
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
	public Api.TypeSet_client_DH_params_answer setClientDHParams(Api.SetClientDHParams setClientDHParams) {
		return null;
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
	public Api.Pong pingDelayDisconnect(Api.PingDelayDisconnect pingDelayDisconnect) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xe7512126, name = "DestroySession")
	public Api.TypeDestroySessionRes destroySession(Api.DestroySession destroySession) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xcb9f372d, name = "InvokeAfterMsg")
	public Api.X invokeAfterMsg(Api.InvokeAfterMsg invokeAfterMsg) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x3dc4b4f0, name = "InvokeAfterMsgs")
	public Api.X invokeAfterMsgs(Api.InvokeAfterMsgs invokeAfterMsgs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xc1cd5ea9, name = "InitConnection")
	public Api.X initConnection(Api.InitConnection initConnection) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xda9b0d0d, name = "InvokeWithLayer")
	public Api.X invokeWithLayer(Api.InvokeWithLayer invokeWithLayer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xbf9459b7, name = "InvokeWithoutUpdates")
	public Api.X invokeWithoutUpdates(Api.InvokeWithoutUpdates invokeWithoutUpdates) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x365275f2, name = "InvokeWithMessagesRange")
	public Api.X invokeWithMessagesRange(Api.InvokeWithMessagesRange invokeWithMessagesRange) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xaca9fd2e, name = "InvokeWithTakeout")
	public Api.X invokeWithTakeout(Api.InvokeWithTakeout invokeWithTakeout) {
		return null;
	}
}
