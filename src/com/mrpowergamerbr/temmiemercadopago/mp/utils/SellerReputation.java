
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SellerReputation {

    @SerializedName("level_id")
    @Expose
    public Object levelId;
    @SerializedName("power_seller_status")
    @Expose
    public Object powerSellerStatus;
    @SerializedName("transactions")
    @Expose
    public Transactions transactions;
    @SerializedName("metrics")
    @Expose
    public Metrics metrics;

}
