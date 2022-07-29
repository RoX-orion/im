package com.im.api;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigInteger;

public class PaymentsApi {

	public static class TypePaymentForm {}
	public static class TypeValidatedRequestedInfo {}
	public static class TypePaymentResult {}
	public static class TypePaymentReceipt {}
	public static class TypeSavedInfo {}
	public static class TypeBankCardData {}
	public static class TypeExportedInvoice {}

	@Data
	public static class PaymentForm {
		private Api.True canSaveCredentials;
		private Api.True passwordMissing;
		private BigInteger formId;
		private BigInteger botId;
		private String title;
		private String description;
		private Api.TypeWebDocument photo;
		private Api.TypeInvoice invoice;
		private BigInteger providerId;
		private String url;
		private String nativeProvider;
		private Api.TypeDataJSON nativeParams;
		private Api.TypePaymentRequestedInfo savedInfo;
		private Api.TypePaymentSavedCredentials savedCredentials;
		private Api.TypeUser[] users;
	}

	@Data
	public static class ValidatedRequestedInfo {
		private String id;
		private Api.TypeShippingOption[] shippingOptions;
	}

	@Data
	public static class PaymentResult {
		private Api.TypeUpdates updates;
	}

	@Data
	public static class PaymentVerificationNeeded {
		private String url;
	}

	@Data
	public static class PaymentReceipt {
		private int date;
		private BigInteger botId;
		private BigInteger providerId;
		private String title;
		private String description;
		private Api.TypeWebDocument photo;
		private Api.TypeInvoice invoice;
		private Api.TypePaymentRequestedInfo info;
		private Api.TypeShippingOption shipping;
		private BigInteger tipAmount;
		private String currency;
		private BigInteger totalAmount;
		private String credentialsTitle;
		private Api.TypeUser[] users;
	}

	@Data
	public static class SavedInfo {
		private Api.True hasSavedCredentials;
		private Api.TypePaymentRequestedInfo savedInfo;
	}

	@Data
	public static class BankCardData {
		private String title;
		private Api.TypeBankCardOpenUrl[] openUrls;
	}

	@Data
	public static class ExportedInvoice {
		private String url;
	}

	@Data
	public static class GetPaymentForm {
		private Api.TypeInputInvoice invoice;
		private Api.TypeDataJSON themeParams;
	}

	@Data
	public static class GetPaymentReceipt {
		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class ValidateRequestedInfo {
		private Api.True save;
		private Api.TypeInputInvoice invoice;
		private Api.TypePaymentRequestedInfo info;
	}

	@Data
	public static class SendPaymentForm {
		private BigInteger formId;
		private Api.TypeInputInvoice invoice;
		private String requestedInfoId;
		private String shippingOptionId;
		private Api.TypeInputPaymentCredentials credentials;
		private BigInteger tipAmount;
	}

	@Data
	public static class GetSavedInfo {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class ClearSavedInfo extends Api.TypeBool {
		private Api.True credentials;
		private Api.True info;
	}

	@Data
	public static class GetBankCardData {
		private String number;
	}

	@Data
	public static class ExportInvoice {
		private Api.TypeInputMedia invoiceMedia;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AssignAppStoreTransaction extends Api.TypeUpdates {
		private Api.True restore;
		private String transactionId;
		private byte[] receipt;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class AssignPlayMarketTransaction extends Api.TypeUpdates {
		private String purchaseToken;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RestorePlayMarketReceipt extends Api.TypeUpdates {
		private byte[] receipt;
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class CanPurchasePremium extends Api.TypeBool {
	}

	@Data
	@EqualsAndHashCode(callSuper=false)
	public static class RequestRecurringPayment extends Api.TypeUpdates {
		private Api.TypeInputUser userId;
		private String recurringInitCharge;
		private Api.TypeInputMedia invoiceMedia;
	}
}