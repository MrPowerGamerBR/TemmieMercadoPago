package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Transactions {
    @SerializedName("period")
    @Expose
    private String period;
    @SerializedName("total")
    @Expose
    private Integer total;
    @SerializedName("completed")
    @Expose
    private Integer completed;
    // @SerializedName("canceled")
    // @Expose
    // private Integer canceled;
    @SerializedName("ratings")
    @Expose
    private Ratings ratings;
}
