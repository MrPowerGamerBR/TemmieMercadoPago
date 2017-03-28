
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Company {
    @SerializedName("corporate_name")
    @Expose
    private Object corporateName;
    @SerializedName("brand_name")
    @Expose
    private String brandName;
    @SerializedName("identification")
    @Expose
    private Object identification;
    @SerializedName("state_tax_id")
    @Expose
    private Object stateTaxId;
    @SerializedName("city_tax_id")
    @Expose
    private Object cityTaxId;
}
