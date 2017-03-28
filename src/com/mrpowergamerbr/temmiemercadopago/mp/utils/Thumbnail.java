
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Thumbnail {

    @SerializedName("picture_id")
    @Expose
    public String pictureId;
    @SerializedName("picture_url")
    @Expose
    public String pictureUrl;

}
