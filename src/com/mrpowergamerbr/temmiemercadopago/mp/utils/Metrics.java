package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Metrics {
    @SerializedName("sales")
    @Expose
    private Sales sales;
    @SerializedName("claims")
    @Expose
    private Claims claims;
    @SerializedName("delayed_handling_time")
    @Expose
    private DelayedHandlingTime delayedHandlingTime;
}
