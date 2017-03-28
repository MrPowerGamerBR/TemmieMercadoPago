package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Canceled {
    @SerializedName("total")
    @Expose
    private Object total;
    @SerializedName("paid")
    @Expose
    private Object paid;
}
