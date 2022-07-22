package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class BotsApi {


	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class SendCustomRequest extends Api.TypeDataJSON {
		private final Long constructorId = 2854709741L;
		private final long subclassOfId = 2902676200L;
		private final Boolean isFunction = true;

		private Api.TypeDataJSON params;
		private String customMethod;
	}

	@Data
	public static class AnswerWebhookJSONQuery {
		private final Long constructorId = 3860938573L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeDataJSON data;
		private BigInteger queryId;
	}

	@Data
	public static class SetBotCommands {
		private final Long constructorId = 85399130L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeBotCommandScope scope;
		private String langCode;
		private Api.TypeBotCommand[] commands;
	}

	@Data
	public static class ResetBotCommands {
		private final Long constructorId = 1032708345L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeBotCommandScope scope;
		private String langCode;
	}

	@Data
	public static class GetBotCommands {
		private final Long constructorId = 3813412310L;
		private final long subclassOfId = 4209579305L;
		private final Boolean isFunction = true;

		private Api.TypeBotCommandScope scope;
		private String langCode;
	}

	@Data
	public static class SetBotMenuButton {
		private final Long constructorId = 1157944655L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeBotMenuButton button;
		private Api.TypeInputUser userId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class GetBotMenuButton extends Api.TypeBotMenuButton {
		private final Long constructorId = 2623597352L;
		private final long subclassOfId = 1282522428L;
		private final Boolean isFunction = true;

		private Api.TypeInputUser userId;
	}

	@Data
	public static class SetBotBroadcastDefaultAdminRights {
		private final Long constructorId = 2021942497L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeChatAdminRights adminRights;
	}

	@Data
	public static class SetBotGroupDefaultAdminRights {
		private final Long constructorId = 2455685610L;
		private final long subclassOfId = 4122188204L;
		private final Boolean isFunction = true;

		private Api.TypeChatAdminRights adminRights;
	}
}