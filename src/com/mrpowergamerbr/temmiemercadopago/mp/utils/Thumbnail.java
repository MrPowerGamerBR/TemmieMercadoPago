package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Thumbnail {
    @SerializedName("picture_id")
    @Expose
    private String pictureId;
    @SerializedName("picture_url")
    @Expose
    private String pictureUrl;
}
