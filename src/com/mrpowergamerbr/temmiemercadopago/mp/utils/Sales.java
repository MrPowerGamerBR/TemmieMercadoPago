
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sales {

    @SerializedName("period")
    @Expose
    public Object period;
    @SerializedName("completed")
    @Expose
    public Object completed;

}
