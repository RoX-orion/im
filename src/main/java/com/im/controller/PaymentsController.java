package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandlerMapping;
import org.springframework.stereotype.Controller;

@Controller
public class PaymentsController {

	@WebsocketHandlerMapping(value = 924093883, name = "GetPaymentForm")
	public PaymentsApi.PaymentForm getPaymentForm(PaymentsApi.GetPaymentForm getPaymentForm) {
		return null;
	}

	@WebsocketHandlerMapping(value = 611897804, name = "GetPaymentReceipt")
	public PaymentsApi.PaymentReceipt getPaymentReceipt(PaymentsApi.GetPaymentReceipt getPaymentReceipt) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1228345045, name = "ValidateRequestedInfo")
	public PaymentsApi.ValidatedRequestedInfo validateRequestedInfo(PaymentsApi.ValidateRequestedInfo validateRequestedInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 755192367, name = "SendPaymentForm")
	public PaymentsApi.PaymentResult sendPaymentForm(PaymentsApi.SendPaymentForm sendPaymentForm) {
		return null;
	}

	@WebsocketHandlerMapping(value = 578650699, name = "GetSavedInfo")
	public PaymentsApi.SavedInfo getSavedInfo(PaymentsApi.GetSavedInfo getSavedInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = -667062079, name = "ClearSavedInfo")
	public Boolean clearSavedInfo(PaymentsApi.ClearSavedInfo clearSavedInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 779736953, name = "GetBankCardData")
	public PaymentsApi.BankCardData getBankCardData(PaymentsApi.GetBankCardData getBankCardData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 261206117, name = "ExportInvoice")
	public PaymentsApi.ExportedInvoice exportInvoice(PaymentsApi.ExportInvoice exportInvoice) {
		return null;
	}

	@WebsocketHandlerMapping(value = 267129798, name = "AssignAppStoreTransaction")
	public Api.Updates assignAppStoreTransaction(PaymentsApi.AssignAppStoreTransaction assignAppStoreTransaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 1336560365, name = "AssignPlayMarketTransaction")
	public Api.Updates assignPlayMarketTransaction(PaymentsApi.AssignPlayMarketTransaction assignPlayMarketTransaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = -781917334, name = "RestorePlayMarketReceipt")
	public Api.Updates restorePlayMarketReceipt(PaymentsApi.RestorePlayMarketReceipt restorePlayMarketReceipt) {
		return null;
	}

	@WebsocketHandlerMapping(value = -1435856696, name = "CanPurchasePremium")
	public Boolean canPurchasePremium(PaymentsApi.CanPurchasePremium canPurchasePremium) {
		return null;
	}

	@WebsocketHandlerMapping(value = 342791565, name = "RequestRecurringPayment")
	public Api.Updates requestRecurringPayment(PaymentsApi.RequestRecurringPayment requestRecurringPayment) {
		return null;
	}
}