
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Credit {

    @SerializedName("consumed")
    @Expose
    public Integer consumed;
    @SerializedName("credit_level_id")
    @Expose
    public String creditLevelId;

}
