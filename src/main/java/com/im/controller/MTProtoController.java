package com.im.controller;

import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.annotation.WebsocketRequestParam;
import com.im.lib.tl.MTProtoApi;
import com.im.lib.tl.TLRPC;
import com.im.service.MTProtoService;
import io.netty.channel.Channel;

@WebsocketHandler
public class MTProtoController {

	private final MTProtoService mtprotoService;

	public MTProtoController(final MTProtoService mtprotoService) {
		this.mtprotoService = mtprotoService;
	}

	@WebsocketHandlerMapping(value = 0xbe7e8ef1, name = "ReqPqMulti")
	public MTProtoApi.ResPQ reqPqMulti(MTProtoApi.ReqPqMulti reqPqMulti) {
		return mtprotoService.reqPqMulti(reqPqMulti);
	}

	@WebsocketHandlerMapping(value = 0x51b410fd, name = "ReqPqMultiNew")
	public MTProtoApi.ResPQ reqPqMultiNew(MTProtoApi.ReqPqMultiNew reqPqMultiNew) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd712e4be, name = "ReqDHParams")
	public MTProtoApi.Server_DH_params reqDHParams(MTProtoApi.ReqDHParams reqDHParams) throws Exception {
		return mtprotoService.reqDHParams(reqDHParams);
	}

	@WebsocketHandlerMapping(value = 0xf5045f1f, name = "SetClientDHParams")
	public MTProtoApi.Set_client_DH_params_answer setClientDHParams(MTProtoApi.SetClientDHParams setClientDHParams,
	                                                             Channel channel) {
		return mtprotoService.setClientDHParams(setClientDHParams, channel);
	}

//	@WebsocketHandlerMapping(value = 0xd1435160, name = "DestroyAuthKey")
//	public Api.TypeDestroyAuthKeyRes destroyAuthKey(Api.DestroyAuthKey destroyAuthKey) {
//		return null;
//	}
//
//	@WebsocketHandlerMapping(value = 0x58e4a740, name = "RpcDropAnswer")
//	public Api.TypeRpcDropAnswer rpcDropAnswer(Api.RpcDropAnswer rpcDropAnswer) {
//		return null;
//	}

//	@WebsocketHandlerMapping(value = 0xb921bd04, name = "GetFutureSalts")
//	public MTProtoApi.FutureSalts getFutureSalts(Api.GetFutureSalts getFutureSalts) {
//		return null;
//	}

	@WebsocketHandlerMapping(value = 0xf3427b8c, name = "PingDelayDisconnect")
	public MTProtoApi.Pong pingDelayDisconnect(MTProtoApi.Ping_delay_disconnect pingDelayDisconnect,
	                                           @WebsocketRequestParam("msgId") long msgId) {
		return mtprotoService.pingDelayDisconnect(pingDelayDisconnect, msgId);
	}

//	@WebsocketHandlerMapping(value = 0xe7512126, name = "DestroySession")
//	public Api.TypeDestroySessionRes destroySession(Api.DestroySession destroySession) {
//		return null;
//	}

	@WebsocketHandlerMapping(value = 0xda9b0d0d, name = "invokeWithLayer")
	public Object invokeWithLayer(TLRPC.TL_invokeWithLayer invokeWithLayer) {
		return mtprotoService.invokeWithLayer(invokeWithLayer);
	}

	@WebsocketHandlerMapping(value = 0x62d6b459, name = "msgsAck")
	public void msgsAck(MTProtoApi.Msgs_ack msgsAck,
	                    @WebsocketRequestParam("sessionId") long sessionId) {
		mtprotoService.msgsAck(msgsAck, sessionId);
	}
}
