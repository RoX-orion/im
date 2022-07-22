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
		private final Long constructorId = 2954050359L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private BigInteger formId;
		private Api.TypePaymentSavedCredentials savedCredentials;
		private String description;
		private Api.TypeWebDocument photo;
		private String title;
		private String url;
		private Api.TypeUser[] users;
		private Boolean canSaveCredentials;
		private Boolean passwordMissing;
		private BigInteger providerId;
		private Api.TypeDataJSON nativeParams;
		private Api.TypePaymentRequestedInfo savedInfo;
		private BigInteger botId;
		private Api.TypeInvoice invoice;
		private String nativeProvider;
	}

	@Data
	public static class ValidatedRequestedInfo {
		private final Long constructorId = 3510966403L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private String id;
		private Api.TypeShippingOption[] shippingOptions;
	}

	@Data
	public static class PaymentResult {
		private final Long constructorId = 1314881805L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypeUpdates updates;
	}

	@Data
	public static class PaymentVerificationNeeded {
		private final Long constructorId = 3628142905L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private String url;
	}

	@Data
	public static class PaymentReceipt {
		private final Long constructorId = 1891958275L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private int date;
		private BigInteger tipAmount;
		private String description;
		private Api.TypeWebDocument photo;
		private String title;
		private Api.TypeUser[] users;
		private BigInteger totalAmount;
		private Api.TypeShippingOption shipping;
		private BigInteger providerId;
		private String currency;
		private BigInteger botId;
		private Api.TypeInvoice invoice;
		private String credentialsTitle;
		private Api.TypePaymentRequestedInfo info;
	}

	@Data
	public static class SavedInfo {
		private final Long constructorId = 4220511292L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Boolean hasSavedCredentials;
		private Api.TypePaymentRequestedInfo savedInfo;
	}

	@Data
	public static class BankCardData {
		private final Long constructorId = 1042605427L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private Api.TypeBankCardOpenUrl[] openUrls;
		private String title;
	}

	@Data
	public static class ExportedInvoice {
		private final Long constructorId = 2932919257L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = false;

		private String url;
	}

	@Data
	public static class GetPaymentForm {
		private final Long constructorId = 924093883L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeDataJSON themeParams;
		private Api.TypeInputInvoice invoice;
	}

	@Data
	public static class GetPaymentReceipt {
		private final Long constructorId = 611897804L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputPeer peer;
		private int msgId;
	}

	@Data
	public static class ValidateRequestedInfo {
		private final Long constructorId = 3066622251L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Boolean save;
		private Api.TypeInputInvoice invoice;
		private Api.TypePaymentRequestedInfo info;
	}

	@Data
	public static class SendPaymentForm {
		private final Long constructorId = 755192367L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private BigInteger formId;
		private Api.TypeInputPaymentCredentials credentials;
		private BigInteger tipAmount;
		private Api.TypeInputInvoice invoice;
		private String requestedInfoId;
		private String shippingOptionId;
	}

	@Data
	public static class GetSavedInfo {
		private final Long constructorId = 578650699L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

	}

	@Data
	public static class ClearSavedInfo {
		private final Long constructorId = 3627905217L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Boolean credentials;
		private Boolean info;
	}

	@Data
	public static class GetBankCardData {
		private final Long constructorId = 779736953L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String number;
	}

	@Data
	public static class ExportInvoice {
		private final Long constructorId = 261206117L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputMedia invoiceMedia;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AssignAppStoreTransaction extends Api.TypeUpdates {
		private final Long constructorId = 267129798L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Boolean restore;
		private byte receipt;
		private String transactionId;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class AssignPlayMarketTransaction extends Api.TypeUpdates {
		private final Long constructorId = 1336560365L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private String purchaseToken;
	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class RestorePlayMarketReceipt extends Api.TypeUpdates {
		private final Long constructorId = 3513049962L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private byte receipt;
	}

	@Data
	public static class CanPurchasePremium {
		private final Long constructorId = 2859110600L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

	}

	@Data
	@EqualsAndHashCode(callSuper=true)
	public static class RequestRecurringPayment extends Api.TypeUpdates {
		private final Long constructorId = 342791565L;
		private final long subclassOfId = 1;
		private final Boolean isFunction = true;

		private Api.TypeInputMedia invoiceMedia;
		private Api.TypeInputUser userId;
		private String recurringInitCharge;
	}
}