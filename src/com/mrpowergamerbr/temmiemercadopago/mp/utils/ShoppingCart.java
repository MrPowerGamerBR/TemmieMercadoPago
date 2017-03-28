
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ShoppingCart {

    @SerializedName("buy")
    @Expose
    public Object buy;
    @SerializedName("sell")
    @Expose
    public String sell;

}
