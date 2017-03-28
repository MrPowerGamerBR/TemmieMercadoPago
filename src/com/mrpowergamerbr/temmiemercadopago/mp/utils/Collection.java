package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter 
public class Collection {
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("date_approved")
    @Expose
    private Object dateApproved;
    @SerializedName("last_modified")
    @Expose
    private String lastModified;
    @SerializedName("money_release_date")
    @Expose
    private Object moneyReleaseDate;
    @SerializedName("operation_type")
    @Expose
    private String operationType;
    @SerializedName("collector_id")
    @Expose
    private Integer collectorId;
    @SerializedName("sponsor_id")
    @Expose
    private Object sponsorId;
    @SerializedName("payer")
    @Expose
    private Payer payer;
    @SerializedName("external_reference")
    @Expose
    private Object externalReference;
    @SerializedName("merchant_order_id")
    @Expose
    private Integer merchantOrderId;
    @SerializedName("reason")
    @Expose
    private String reason;
    @SerializedName("currency_id")
    @Expose
    private String currencyId;
    @SerializedName("transaction_amount")
    @Expose
    private Double transactionAmount;
    @SerializedName("total_paid_amount")
    @Expose
    private Double totalPaidAmount;
    @SerializedName("shipping_cost")
    @Expose
    private Integer shippingCost;
    @SerializedName("account_money_amount")
    @Expose
    private Integer accountMoneyAmount;
    @SerializedName("mercadopago_fee")
    @Expose
    private Object mercadopagoFee;
    @SerializedName("net_received_amount")
    @Expose
    private Object netReceivedAmount;
    @SerializedName("marketplace_fee")
    @Expose
    private Object marketplaceFee;
    @SerializedName("coupon_id")
    @Expose
    private Object couponId;
    @SerializedName("coupon_amount")
    @Expose
    private Object couponAmount;
    @SerializedName("coupon_fee")
    @Expose
    private Object couponFee;
    @SerializedName("finance_fee")
    @Expose
    private Integer financeFee;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("status_detail")
    @Expose
    private String statusDetail;
    @SerializedName("status_code")
    @Expose
    private Object statusCode;
    @SerializedName("released")
    @Expose
    private String released;
    @SerializedName("payment_type")
    @Expose
    private String paymentType;
    @SerializedName("installments")
    @Expose
    private Object installments;
    @SerializedName("installment_amount")
    @Expose
    private Double installmentAmount;
    @SerializedName("deferred_period")
    @Expose
    private Object deferredPeriod;
    @SerializedName("cardholder")
    @Expose
    private Cardholder cardholder;
    @SerializedName("statement_descriptor")
    @Expose
    private Object statementDescriptor;
    @SerializedName("last_four_digits")
    @Expose
    private Object lastFourDigits;
    @SerializedName("payment_method_id")
    @Expose
    private String paymentMethodId;
    @SerializedName("marketplace")
    @Expose
    private String marketplace;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("refunds")
    @Expose
    private List<Object> refunds = null;
    @SerializedName("amount_refunded")
    @Expose
    private double amountRefunded;
    @SerializedName("notification_url")
    @Expose
    private Object notificationUrl;
    @SerializedName("internal_metadata")
    @Expose
    private InternalMetadata internalMetadata;
    @SerializedName("transaction_order_id")
    @Expose
    private String transactionOrderId;

}
