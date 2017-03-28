
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class List {

    @SerializedName("allow")
    @Expose
    public Boolean allow;
    @SerializedName("codes")
    @Expose
    public java.util.List<Object> codes = null;
    @SerializedName("immediate_payment")
    @Expose
    public ImmediatePayment immediatePayment;

}
