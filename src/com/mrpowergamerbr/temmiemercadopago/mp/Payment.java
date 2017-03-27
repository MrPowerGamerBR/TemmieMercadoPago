package com.mrpowergamerbr.temmiemercadopago.mp;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.BackUrls;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.Payer;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.PaymentMethods;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.Shipments;

import lombok.Getter;

@Getter
public class Payment {
	@SerializedName("collector_id")
	@Expose
	private Integer collectorId;
	@SerializedName("operation_type")
	@Expose
	private String operationType;
	@SerializedName("items")
	@Expose
	private List<TemmieItem> items = null;
	@SerializedName("payer")
	@Expose
	private Payer payer;
	@SerializedName("back_urls")
	@Expose
	private BackUrls backUrls;
	@SerializedName("auto_return")
	@Expose
	private String autoReturn;
	@SerializedName("payment_methods")
	@Expose
	private PaymentMethods paymentMethods;
	@SerializedName("client_id")
	@Expose
	private String clientId;
	@SerializedName("marketplace")
	@Expose
	private String marketplace;
	@SerializedName("marketplace_fee")
	@Expose
	private Integer marketplaceFee;
	@SerializedName("shipments")
	@Expose
	private Shipments shipments;
	@SerializedName("notification_url")
	@Expose
	private Object notificationUrl;
	@SerializedName("external_reference")
	@Expose
	private String externalReference;
	@SerializedName("additional_info")
	@Expose
	private String additionalInfo;
	@SerializedName("expires")
	@Expose
	private Boolean expires;
	@SerializedName("expiration_date_from")
	@Expose
	private Object expirationDateFrom;
	@SerializedName("expiration_date_to")
	@Expose
	private Object expirationDateTo;
	@SerializedName("date_created")
	@Expose
	private String dateCreated;
	@SerializedName("id")
	@Expose
	private String id;
	@SerializedName("init_point")
	@Expose
	private String initPoint;
	@SerializedName("sandbox_init_point")
	@Expose
	private String sandboxInitPoint;
}