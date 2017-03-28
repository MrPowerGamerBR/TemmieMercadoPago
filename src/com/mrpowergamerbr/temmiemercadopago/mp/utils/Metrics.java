
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metrics {

    @SerializedName("sales")
    @Expose
    public Sales sales;
    @SerializedName("claims")
    @Expose
    public Claims claims;
    @SerializedName("delayed_handling_time")
    @Expose
    public DelayedHandlingTime delayedHandlingTime;

}
