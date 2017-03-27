package com.mrpowergamerbr.temmiemercadopago.mp;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mrpowergamerbr.temmiemercadopago.internal.autogen.*;

public class Payment {

	@SerializedName("collector_id")
	@Expose
	private Integer collectorId;
	@SerializedName("operation_type")
	@Expose
	private String operationType;
	@SerializedName("items")
	@Expose
	private List<Item> items = null;
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

	public Integer getCollectorId() {
		return collectorId;
	}

	public void setCollectorId(Integer collectorId) {
		this.collectorId = collectorId;
	}

	public String getOperationType() {
		return operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Payer getPayer() {
		return payer;
	}

	public void setPayer(Payer payer) {
		this.payer = payer;
	}

	public BackUrls getBackUrls() {
		return backUrls;
	}

	public void setBackUrls(BackUrls backUrls) {
		this.backUrls = backUrls;
	}

	public String getAutoReturn() {
		return autoReturn;
	}

	public void setAutoReturn(String autoReturn) {
		this.autoReturn = autoReturn;
	}

	public PaymentMethods getPaymentMethods() {
		return paymentMethods;
	}

	public void setPaymentMethods(PaymentMethods paymentMethods) {
		this.paymentMethods = paymentMethods;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getMarketplace() {
		return marketplace;
	}

	public void setMarketplace(String marketplace) {
		this.marketplace = marketplace;
	}

	public Integer getMarketplaceFee() {
		return marketplaceFee;
	}

	public void setMarketplaceFee(Integer marketplaceFee) {
		this.marketplaceFee = marketplaceFee;
	}

	public Shipments getShipments() {
		return shipments;
	}

	public void setShipments(Shipments shipments) {
		this.shipments = shipments;
	}

	public Object getNotificationUrl() {
		return notificationUrl;
	}

	public void setNotificationUrl(Object notificationUrl) {
		this.notificationUrl = notificationUrl;
	}

	public String getExternalReference() {
		return externalReference;
	}

	public void setExternalReference(String externalReference) {
		this.externalReference = externalReference;
	}

	public String getAdditionalInfo() {
		return additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		this.additionalInfo = additionalInfo;
	}

	public Boolean getExpires() {
		return expires;
	}

	public void setExpires(Boolean expires) {
		this.expires = expires;
	}

	public Object getExpirationDateFrom() {
		return expirationDateFrom;
	}

	public void setExpirationDateFrom(Object expirationDateFrom) {
		this.expirationDateFrom = expirationDateFrom;
	}

	public Object getExpirationDateTo() {
		return expirationDateTo;
	}

	public void setExpirationDateTo(Object expirationDateTo) {
		this.expirationDateTo = expirationDateTo;
	}

	public String getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(String dateCreated) {
		this.dateCreated = dateCreated;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getInitPoint() {
		return initPoint;
	}

	public void setInitPoint(String initPoint) {
		this.initPoint = initPoint;
	}

	public String getSandboxInitPoint() {
		return sandboxInitPoint;
	}

	public void setSandboxInitPoint(String sandboxInitPoint) {
		this.sandboxInitPoint = sandboxInitPoint;
	}

}