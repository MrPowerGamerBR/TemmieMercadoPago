package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class ImmediatePayment {
    @SerializedName("required")
    @Expose
    private Boolean required;
    @SerializedName("reasons")
    @Expose
    private List<Object> reasons = null;
}
