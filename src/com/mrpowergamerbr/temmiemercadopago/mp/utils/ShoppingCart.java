package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class ShoppingCart {
    @SerializedName("buy")
    @Expose
    private String buy;
    @SerializedName("sell")
    @Expose
    private String sell;
}
