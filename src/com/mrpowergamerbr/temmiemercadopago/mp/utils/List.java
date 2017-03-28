package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class List {
    @SerializedName("allow")
    @Expose
    private Boolean allow;
    @SerializedName("codes")
    @Expose
    private java.util.List<Object> codes = null;
    @SerializedName("immediate_payment")
    @Expose
    private ImmediatePayment immediatePayment;
}
