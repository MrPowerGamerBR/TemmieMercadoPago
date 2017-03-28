package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Payer {
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("surname")
    @Expose
    private String surname;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("date_created")
    @Expose
    private String dateCreated;
    @SerializedName("phone")
    @Expose
    private Phone phone;
    @SerializedName("identification")
    @Expose
    private Identification identification;
    @SerializedName("address")
    @Expose
    private Address address;
}
