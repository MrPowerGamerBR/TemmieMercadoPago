package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class PaymentMethods {
    @SerializedName("excluded_payment_methods")
    @Expose
    private List<ExcludedPaymentMethod> excludedPaymentMethods = null;
    @SerializedName("excluded_payment_types")
    @Expose
    private List<ExcludedPaymentType> excludedPaymentTypes = null;
    @SerializedName("installments")
    @Expose
    private Object installments;
    @SerializedName("default_payment_method_id")
    @Expose
    private Object defaultPaymentMethodId;
    @SerializedName("default_installments")
    @Expose
    private Object defaultInstallments;
}
