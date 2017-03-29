package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class DifferentialPricing {
    @SerializedName("id")
    @Expose
    private Integer id;
}
