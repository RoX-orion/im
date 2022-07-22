package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class ApiController {

	@WebsocketHandlerMapping(value = 1615239032L, name = "ReqPq")
	public Api.ResPQ reqPq(Api.ReqPq reqPq) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3195965169L, name = "ReqPqMulti")
	public Api.ResPQ reqPqMulti(Api.ReqPqMulti reqPqMulti) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1370755325L, name = "ReqPqMultiNew")
	public Api.ResPQ reqPqMultiNew(Api.ReqPqMultiNew reqPqMultiNew) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3608339646L, name = "ReqDHParams")
	public Api.TypeServer_DH_Params reqDHParams(Api.ReqDHParams reqDHParams) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4110704415L, name = "SetClientDHParams")
	public Api.TypeSet_client_DH_params_answer setClientDHParams(Api.SetClientDHParams setClientDHParams) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3510849888L, name = "DestroyAuthKey")
	public Api.TypeDestroyAuthKeyRes destroyAuthKey(Api.DestroyAuthKey destroyAuthKey) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1491380032L, name = "RpcDropAnswer")
	public Api.TypeRpcDropAnswer rpcDropAnswer(Api.RpcDropAnswer rpcDropAnswer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3105996036L, name = "GetFutureSalts")
	public Api.FutureSalts getFutureSalts(Api.GetFutureSalts getFutureSalts) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2059302892L, name = "Ping")
	public Api.Pong ping(Api.Ping ping) {
		return null;
	}

	@WebsocketHandlerMapping(value = 4081220492L, name = "PingDelayDisconnect")
	public Api.Pong pingDelayDisconnect(Api.PingDelayDisconnect pingDelayDisconnect) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3880853798L, name = "DestroySession")
	public Api.TypeDestroySessionRes destroySession(Api.DestroySession destroySession) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3416209197L, name = "InvokeAfterMsg")
	public Api.X invokeAfterMsg(Api.InvokeAfterMsg invokeAfterMsg) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1036301552L, name = "InvokeAfterMsgs")
	public Api.X invokeAfterMsgs(Api.InvokeAfterMsgs invokeAfterMsgs) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3251461801L, name = "InitConnection")
	public Api.X initConnection(Api.InitConnection initConnection) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3667594509L, name = "InvokeWithLayer")
	public Api.X invokeWithLayer(Api.InvokeWithLayer invokeWithLayer) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3214170551L, name = "InvokeWithoutUpdates")
	public Api.X invokeWithoutUpdates(Api.InvokeWithoutUpdates invokeWithoutUpdates) {
		return null;
	}

	@WebsocketHandlerMapping(value = 911373810L, name = "InvokeWithMessagesRange")
	public Api.X invokeWithMessagesRange(Api.InvokeWithMessagesRange invokeWithMessagesRange) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2896821550L, name = "InvokeWithTakeout")
	public Api.X invokeWithTakeout(Api.InvokeWithTakeout invokeWithTakeout) {
		return null;
	}
}