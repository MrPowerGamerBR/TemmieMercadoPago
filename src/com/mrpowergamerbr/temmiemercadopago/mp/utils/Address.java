package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Address {
    @SerializedName("street_name")
    @Expose
    private String streetName;
    @SerializedName("street_number")
    @Expose
    private Object streetNumber;
    @SerializedName("zip_code")
    @Expose
    private String zipCode;
}
