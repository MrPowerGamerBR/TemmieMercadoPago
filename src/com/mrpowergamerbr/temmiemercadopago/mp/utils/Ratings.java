package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Ratings {
    @SerializedName("positive")
    @Expose
    private Integer positive;
    @SerializedName("negative")
    @Expose
    private Integer negative;
    @SerializedName("neutral")
    @Expose
    private Integer neutral;
}
