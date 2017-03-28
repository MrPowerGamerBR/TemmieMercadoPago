package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Phone {
    @SerializedName("area_code")
    @Expose
    private String areaCode;
    @SerializedName("number")
    @Expose
    private String number;
}
