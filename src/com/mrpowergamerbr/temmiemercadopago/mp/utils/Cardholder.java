package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Cardholder {
    @SerializedName("name")
    @Expose
    private Object name;
    @SerializedName("identification")
    @Expose
    private Identification identification;
}
