
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Context {

    @SerializedName("source")
    @Expose
    public String source;
    @SerializedName("flow")
    @Expose
    public Object flow;
    @SerializedName("device")
    @Expose
    public Object device;

}
