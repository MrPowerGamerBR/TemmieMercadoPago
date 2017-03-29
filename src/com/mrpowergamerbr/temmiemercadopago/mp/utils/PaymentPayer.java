package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
/**
 * Used in payment search tool
 * 
 * @author MrPowerGamerBR
 */
public class PaymentPayer {
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
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
    @SerializedName("id")
    private long id;
}
