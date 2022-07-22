package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PaymentsController {

	@WebsocketHandlerMapping(value = 924093883L, name = "GetPaymentForm")
	public PaymentsApi.PaymentForm getPaymentForm(PaymentsApi.GetPaymentForm getPaymentForm) {
		return null;
	}

	@WebsocketHandlerMapping(value = 611897804L, name = "GetPaymentReceipt")
	public PaymentsApi.PaymentReceipt getPaymentReceipt(PaymentsApi.GetPaymentReceipt getPaymentReceipt) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3066622251L, name = "ValidateRequestedInfo")
	public PaymentsApi.ValidatedRequestedInfo validateRequestedInfo(PaymentsApi.ValidateRequestedInfo validateRequestedInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 755192367L, name = "SendPaymentForm")
	public PaymentsApi.PaymentResult sendPaymentForm(PaymentsApi.SendPaymentForm sendPaymentForm) {
		return null;
	}

	@WebsocketHandlerMapping(value = 578650699L, name = "GetSavedInfo")
	public PaymentsApi.SavedInfo getSavedInfo(PaymentsApi.GetSavedInfo getSavedInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3627905217L, name = "ClearSavedInfo")
	public Boolean clearSavedInfo(PaymentsApi.ClearSavedInfo clearSavedInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 779736953L, name = "GetBankCardData")
	public PaymentsApi.BankCardData getBankCardData(PaymentsApi.GetBankCardData getBankCardData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 261206117L, name = "ExportInvoice")
	public PaymentsApi.ExportedInvoice exportInvoice(PaymentsApi.ExportInvoice exportInvoice) {
		return null;
	}

	@WebsocketHandlerMapping(value = 267129798L, name = "AssignAppStoreTransaction")
	public Api.Updates assignAppStoreTransaction(PaymentsApi.AssignAppStoreTransaction assignAppStoreTransaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1336560365L, name = "AssignPlayMarketTransaction")
	public Api.Updates assignPlayMarketTransaction(PaymentsApi.AssignPlayMarketTransaction assignPlayMarketTransaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 3513049962L, name = "RestorePlayMarketReceipt")
	public Api.Updates restorePlayMarketReceipt(PaymentsApi.RestorePlayMarketReceipt restorePlayMarketReceipt) {
		return null;
	}

	@WebsocketHandlerMapping(value = 2859110600L, name = "CanPurchasePremium")
	public Boolean canPurchasePremium(PaymentsApi.CanPurchasePremium canPurchasePremium) {
		return null;
	}

	@WebsocketHandlerMapping(value = 342791565L, name = "RequestRecurringPayment")
	public Api.Updates requestRecurringPayment(PaymentsApi.RequestRecurringPayment requestRecurringPayment) {
		return null;
	}
}