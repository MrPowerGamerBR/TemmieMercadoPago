
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DelayedHandlingTime {

    @SerializedName("period")
    @Expose
    public Object period;
    @SerializedName("rate")
    @Expose
    public Object rate;

}
