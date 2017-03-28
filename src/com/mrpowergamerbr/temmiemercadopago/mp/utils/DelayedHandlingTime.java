package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class DelayedHandlingTime {
    @SerializedName("period")
    @Expose
    private Object period;
    @SerializedName("rate")
    @Expose
    private Object rate;
}
