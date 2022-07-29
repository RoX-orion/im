package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class BotsApi {


	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SendCustomRequest extends Api.TypeDataJSON {
		private String customMethod;
		private Api.TypeDataJSON params;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AnswerWebhookJSONQuery extends Api.TypeBool {
		private BigInteger queryId;
		private Api.TypeDataJSON data;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotCommands extends Api.TypeBool {
		private Api.TypeBotCommandScope scope;
		private String langCode;
		private Api.TypeBotCommand[] commands;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ResetBotCommands extends Api.TypeBool {
		private Api.TypeBotCommandScope scope;
		private String langCode;
	}

	@Data
	public static class GetBotCommands {
		private Api.TypeBotCommandScope scope;
		private String langCode;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotMenuButton extends Api.TypeBool {
		private Api.TypeInputUser userId;
		private Api.TypeBotMenuButton button;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class GetBotMenuButton extends Api.TypeBotMenuButton {
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotBroadcastDefaultAdminRights extends Api.TypeBool {
		private Api.TypeChatAdminRights adminRights;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class SetBotGroupDefaultAdminRights extends Api.TypeBool {
		private Api.TypeChatAdminRights adminRights;
	}
}