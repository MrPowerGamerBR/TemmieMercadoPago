package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Context {
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("flow")
    @Expose
    private Object flow;
    @SerializedName("device")
    @Expose
    private Object device;
}
