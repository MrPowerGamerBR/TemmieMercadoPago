package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Status {
    @SerializedName("site_status")
    @Expose
    private String siteStatus;
    @SerializedName("list")
    @Expose
    private List list;
    @SerializedName("buy")
    @Expose
    private Buy buy;
    @SerializedName("sell")
    @Expose
    private Sell sell;
    @SerializedName("billing")
    @Expose
    private Billing billing;
    @SerializedName("mercadopago_tc_accepted")
    @Expose
    private Boolean mercadopagoTcAccepted;
    @SerializedName("mercadopago_account_type")
    @Expose
    private String mercadopagoAccountType;
    @SerializedName("mercadoenvios")
    @Expose
    private String mercadoenvios;
    @SerializedName("shopping_cart")
    @Expose
    private ShoppingCart shoppingCart;
    @SerializedName("immediate_payment")
    @Expose
    private Boolean immediatePayment;
    @SerializedName("confirmed_email")
    @Expose
    private Boolean confirmedEmail;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("required_action")
    @Expose
    private String requiredAction;
}
