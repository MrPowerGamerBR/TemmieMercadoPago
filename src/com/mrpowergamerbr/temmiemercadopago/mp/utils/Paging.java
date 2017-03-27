
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Paging {

    @SerializedName("total")
    @Expose
    public Integer total;
    @SerializedName("limit")
    @Expose
    public Integer limit;
    @SerializedName("offset")
    @Expose
    public Integer offset;

}
