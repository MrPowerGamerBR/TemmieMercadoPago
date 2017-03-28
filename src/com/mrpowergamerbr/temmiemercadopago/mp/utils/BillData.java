package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class BillData {
    @SerializedName("accept_credit_note")
    @Expose
    private Object acceptCreditNote;
}
