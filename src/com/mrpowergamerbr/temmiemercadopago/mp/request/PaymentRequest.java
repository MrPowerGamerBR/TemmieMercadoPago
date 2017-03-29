package com.mrpowergamerbr.temmiemercadopago.mp.request;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.mrpowergamerbr.temmiemercadopago.mp.AutoReturnType;
import com.mrpowergamerbr.temmiemercadopago.mp.TemmieItem;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.BackUrls;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.DifferentialPricing;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.Payer;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.PaymentMethods;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.Shipments;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PaymentRequest {
	@SerializedName("items")
	List<TemmieItem> items = new ArrayList<TemmieItem>();
	@SerializedName("payer")
	Payer payer;
	@SerializedName("payment_methods")
	PaymentMethods paymentMethods;
	@SerializedName("shipments")
	Shipments shipments;
	@SerializedName("back_urls")
	BackUrls backUrls;
	@SerializedName("notification_url")
	String notificationUrl;
	@SerializedName("additional_info")
	String additionalInfo;
	@SerializedName("auto_return")
	AutoReturnType autoReturn;
	@SerializedName("external_reference")
	String externalReference;
	@SerializedName("expires")
	boolean expires;
	// TODO: expiration_date_from & expiration_date_to
	@SerializedName("marketplace")
	String marketplace;
	@SerializedName("marketplace_fee")
	float marketplace_fee;
	@SerializedName("differential_pricing")
	DifferentialPricing differentialPricing;
	
	public static class PaymentRequestBuilder {
		List<TemmieItem> items = new ArrayList<TemmieItem>();
		
		public PaymentRequestBuilder addItem(TemmieItem item) {
			items.add(item);
			return this;
		}
	}
}
