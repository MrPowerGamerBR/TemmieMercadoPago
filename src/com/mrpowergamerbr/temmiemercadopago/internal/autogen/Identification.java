
package com.mrpowergamerbr.temmiemercadopago.internal.autogen;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Identification {

    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("number")
    @Expose
    private String number;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

}
