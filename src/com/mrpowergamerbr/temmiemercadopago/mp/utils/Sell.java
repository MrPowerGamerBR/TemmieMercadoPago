package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Sell {
    @SerializedName("allow")
    @Expose
    private Boolean allow;
    @SerializedName("codes")
    @Expose
    private List<Object> codes = null;
    @SerializedName("immediate_payment")
    @Expose
    private ImmediatePayment immediatePayment;
}
