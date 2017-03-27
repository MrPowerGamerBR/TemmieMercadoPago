
package com.mrpowergamerbr.temmiemercadopago.internal.autogen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Object getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(Object streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

}
