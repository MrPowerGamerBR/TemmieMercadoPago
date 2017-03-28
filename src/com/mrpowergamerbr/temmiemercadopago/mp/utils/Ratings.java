
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Ratings {

    @SerializedName("positive")
    @Expose
    public Integer positive;
    @SerializedName("negative")
    @Expose
    public Integer negative;
    @SerializedName("neutral")
    @Expose
    public Integer neutral;

}
