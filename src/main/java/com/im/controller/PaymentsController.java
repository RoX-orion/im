package com.im.controller;

import com.im.api.*;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;

@WebsocketHandler
public class PaymentsController {

	@WebsocketHandlerMapping(value = 0x37148dbb, name = "GetPaymentForm")
	public PaymentsApi.PaymentForm getPaymentForm(PaymentsApi.GetPaymentForm getPaymentForm) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2478d1cc, name = "GetPaymentReceipt")
	public PaymentsApi.PaymentReceipt getPaymentReceipt(PaymentsApi.GetPaymentReceipt getPaymentReceipt) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xb6c8f12b, name = "ValidateRequestedInfo")
	public PaymentsApi.ValidatedRequestedInfo validateRequestedInfo(PaymentsApi.ValidateRequestedInfo validateRequestedInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2d03522f, name = "SendPaymentForm")
	public PaymentsApi.PaymentResult sendPaymentForm(PaymentsApi.SendPaymentForm sendPaymentForm) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x227d824b, name = "GetSavedInfo")
	public PaymentsApi.SavedInfo getSavedInfo(PaymentsApi.GetSavedInfo getSavedInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd83d70c1, name = "ClearSavedInfo")
	public Boolean clearSavedInfo(PaymentsApi.ClearSavedInfo clearSavedInfo) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x2e79d779, name = "GetBankCardData")
	public PaymentsApi.BankCardData getBankCardData(PaymentsApi.GetBankCardData getBankCardData) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xf91b065, name = "ExportInvoice")
	public PaymentsApi.ExportedInvoice exportInvoice(PaymentsApi.ExportInvoice exportInvoice) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xfec13c6, name = "AssignAppStoreTransaction")
	public Api.Updates assignAppStoreTransaction(PaymentsApi.AssignAppStoreTransaction assignAppStoreTransaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x4faa4aed, name = "AssignPlayMarketTransaction")
	public Api.Updates assignPlayMarketTransaction(PaymentsApi.AssignPlayMarketTransaction assignPlayMarketTransaction) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xd164e36a, name = "RestorePlayMarketReceipt")
	public Api.Updates restorePlayMarketReceipt(PaymentsApi.RestorePlayMarketReceipt restorePlayMarketReceipt) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0xaa6a90c8, name = "CanPurchasePremium")
	public Boolean canPurchasePremium(PaymentsApi.CanPurchasePremium canPurchasePremium) {
		return null;
	}

	@WebsocketHandlerMapping(value = 0x146e958d, name = "RequestRecurringPayment")
	public Api.Updates requestRecurringPayment(PaymentsApi.RequestRecurringPayment requestRecurringPayment) {
		return null;
	}
}