
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sell {

    @SerializedName("allow")
    @Expose
    public Boolean allow;
    @SerializedName("codes")
    @Expose
    public List<Object> codes = null;
    @SerializedName("immediate_payment")
    @Expose
    public ImmediatePayment immediatePayment;

}
