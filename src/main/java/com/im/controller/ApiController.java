package com.im.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.service.ApiService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class ApiController {

	@Resource
	private ApiService apiService;

	@WebsocketHandlerMapping(value = 1615239032, name = "ReqPq")
	public Api.ResPQ reqPq(Api.ReqPq reqPq) throws JsonProcessingException {
		return apiService.reqPq(reqPq);
	}

	@WebsocketHandlerMapping(value = -1099002127, name = "ReqPqMulti")
	public Api.ResPQ reqPqMulti(Api.ReqPqMulti reqPqMulti) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1370755325, name = "ReqPqMultiNew")
	public Api.ResPQ reqPqMultiNew(Api.ReqPqMultiNew reqPqMultiNew) {
		return null;
	}

	@WebsocketHandlerMapping(value = -686627650, name = "ReqDHParams")
	public Api.TypeServer_DH_Params reqDHParams(Api.ReqDHParams reqDHParams) {
		return null;
	}

	@WebsocketHandlerMapping(value = -184262881, name = "SetClientDHParams")
	public Api.TypeSet_client_DH_params_answer setClientDHParams(Api.SetClientDHParams setClientDHParams) {
		return null;
	}

	@WebsocketHandlerMapping(value = -784117408, name = "DestroyAuthKey")
	public Api.TypeDestroyAuthKeyRes destroyAuthKey(Api.DestroyAuthKey destroyAuthKey) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1491380032, name = "RpcDropAnswer")
	public Api.TypeRpcDropAnswer rpcDropAnswer(Api.RpcDropAnswer rpcDropAnswer) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1188971260, name = "GetFutureSalts")
	public Api.FutureSalts getFutureSalts(Api.GetFutureSalts getFutureSalts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2059302892, name = "Ping")
	public Api.Pong ping(Api.Ping ping) {
		return null;
	}

	@WebsocketHandlerMapping(value = -213746804, name = "PingDelayDisconnect")
	public Api.Pong pingDelayDisconnect(Api.PingDelayDisconnect pingDelayDisconnect) {
		return null;
	}

	@WebsocketHandlerMapping(value = -414113498, name = "DestroySession")
	public Api.TypeDestroySessionRes destroySession(Api.DestroySession destroySession) {
		return null;
	}

	@WebsocketHandlerMapping(value = -878758099, name = "InvokeAfterMsg")
	public Api.X invokeAfterMsg(Api.InvokeAfterMsg invokeAfterMsg) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1036301552, name = "InvokeAfterMsgs")
	public Api.X invokeAfterMsgs(Api.InvokeAfterMsgs invokeAfterMsgs) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1043505495, name = "InitConnection")
	public Api.X initConnection(Api.InitConnection initConnection) {
		return null;
	}

	@WebsocketHandlerMapping(value = -627372787, name = "InvokeWithLayer")
	public Api.X invokeWithLayer(Api.InvokeWithLayer invokeWithLayer) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1080796745, name = "InvokeWithoutUpdates")
	public Api.X invokeWithoutUpdates(Api.InvokeWithoutUpdates invokeWithoutUpdates) {
		return null;
	}

	@WebsocketHandlerMapping(value = 911373810, name = "InvokeWithMessagesRange")
	public Api.X invokeWithMessagesRange(Api.InvokeWithMessagesRange invokeWithMessagesRange) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1398145746, name = "InvokeWithTakeout")
	public Api.X invokeWithTakeout(Api.InvokeWithTakeout invokeWithTakeout) {
		return null;
	}
}
