
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BackUrls {

    @SerializedName("success")
    @Expose
    private String success;
    @SerializedName("pending")
    @Expose
    private String pending;
    @SerializedName("failure")
    @Expose
    private String failure;

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

    public String getPending() {
        return pending;
    }

    public void setPending(String pending) {
        this.pending = pending;
    }

    public String getFailure() {
        return failure;
    }

    public void setFailure(String failure) {
        this.failure = failure;
    }

}
