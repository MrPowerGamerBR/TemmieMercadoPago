
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Cardholder {

    @SerializedName("name")
    @Expose
    public Object name;
    @SerializedName("identification")
    @Expose
    public Identification identification;

}
