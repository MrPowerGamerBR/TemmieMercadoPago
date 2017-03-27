
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Result {
    @SerializedName("collection")
    @Expose
    private Collection collection;
}
