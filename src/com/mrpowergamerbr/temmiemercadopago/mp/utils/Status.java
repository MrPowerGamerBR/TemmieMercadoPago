
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("site_status")
    @Expose
    public String siteStatus;
    @SerializedName("list")
    @Expose
    public List list;
    @SerializedName("buy")
    @Expose
    public Buy buy;
    @SerializedName("sell")
    @Expose
    public Sell sell;
    @SerializedName("billing")
    @Expose
    public Billing billing;
    @SerializedName("mercadopago_tc_accepted")
    @Expose
    public Boolean mercadopagoTcAccepted;
    @SerializedName("mercadopago_account_type")
    @Expose
    public String mercadopagoAccountType;
    @SerializedName("mercadoenvios")
    @Expose
    public String mercadoenvios;
    @SerializedName("shopping_cart")
    @Expose
    public ShoppingCart shoppingCart;
    @SerializedName("immediate_payment")
    @Expose
    public Boolean immediatePayment;
    @SerializedName("confirmed_email")
    @Expose
    public Boolean confirmedEmail;
    @SerializedName("user_type")
    @Expose
    public String userType;
    @SerializedName("required_action")
    @Expose
    public String requiredAction;

}
