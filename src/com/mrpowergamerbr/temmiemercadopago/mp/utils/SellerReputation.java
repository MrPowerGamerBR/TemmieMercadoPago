package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class SellerReputation {
    @SerializedName("level_id")
    @Expose
    private Object levelId;
    @SerializedName("power_seller_status")
    @Expose
    private Object powerSellerStatus;
    @SerializedName("transactions")
    @Expose
    private Transactions transactions;
    @SerializedName("metrics")
    @Expose
    private Metrics metrics;
}
