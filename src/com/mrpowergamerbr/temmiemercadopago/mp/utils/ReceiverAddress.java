package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class ReceiverAddress {
    @SerializedName("zip_code")
    @Expose
    private String zipCode;
    @SerializedName("street_number")
    @Expose
    private Object streetNumber;
    @SerializedName("street_name")
    @Expose
    private String streetName;
    @SerializedName("floor")
    @Expose
    private String floor;
    @SerializedName("apartment")
    @Expose
    private String apartment;
}
