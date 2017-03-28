
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Company {

    @SerializedName("corporate_name")
    @Expose
    public Object corporateName;
    @SerializedName("brand_name")
    @Expose
    public String brandName;
    @SerializedName("identification")
    @Expose
    public Object identification;
    @SerializedName("state_tax_id")
    @Expose
    public Object stateTaxId;
    @SerializedName("city_tax_id")
    @Expose
    public Object cityTaxId;

}
