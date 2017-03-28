package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Credit {
    @SerializedName("consumed")
    @Expose
    private Integer consumed;
    @SerializedName("credit_level_id")
    @Expose
    private String creditLevelId;
}
