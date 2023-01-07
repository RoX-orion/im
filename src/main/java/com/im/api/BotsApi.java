package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class BotsApi {


	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class SendCustomRequest extends Api.TypeDataJSON {
		private String customMethod;
		private Api.TypeDataJSON params;
	}

	@Data
	public static class AnswerWebhookJSONQuery {
		private BigInteger queryId;
		private Api.TypeDataJSON data;
	}

	@Data
	public static class SetBotCommands {
		private Api.TypeBotCommandScope scope;
		private String langCode;
		private Api.TypeBotCommand[] commands;
	}

	@Data
	public static class ResetBotCommands {
		private Api.TypeBotCommandScope scope;
		private String langCode;
	}

	@Data
	public static class GetBotCommands {
		private Api.TypeBotCommandScope scope;
		private String langCode;
	}

	@Data
	public static class SetBotMenuButton {
		private Api.TypeInputUser userId;
		private Api.TypeBotMenuButton button;
	}

	@Data
	@EqualsAndHashCode(callSuper = true)
	public static class GetBotMenuButton extends Api.TypeBotMenuButton {
		private Api.TypeInputUser userId;
	}

	@Data
	public static class SetBotBroadcastDefaultAdminRights {
		private Api.TypeChatAdminRights adminRights;
	}

	@Data
	public static class SetBotGroupDefaultAdminRights {
		private Api.TypeChatAdminRights adminRights;
	}
}