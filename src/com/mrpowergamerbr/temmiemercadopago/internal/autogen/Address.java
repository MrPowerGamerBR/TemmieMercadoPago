
package com.mrpowergamerbr.temmiemercadopago.internal.autogen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public Object getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Object streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

}
