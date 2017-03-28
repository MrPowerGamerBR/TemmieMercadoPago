package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Sales {
    @SerializedName("period")
    @Expose
    private Object period;
    @SerializedName("completed")
    @Expose
    private Object completed;
}
