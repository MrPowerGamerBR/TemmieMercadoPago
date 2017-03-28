
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NotYetRated {

    @SerializedName("total")
    @Expose
    public Object total;
    @SerializedName("paid")
    @Expose
    public Object paid;
    @SerializedName("units")
    @Expose
    public Object units;

}
