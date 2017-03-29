package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BackUrls {
    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("pending")
    @Expose
    private String pending;
    @SerializedName("failure")
    @Expose
    private String failure;
}
