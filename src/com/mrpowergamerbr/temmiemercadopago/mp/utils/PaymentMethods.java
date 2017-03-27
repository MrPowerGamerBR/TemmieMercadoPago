
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

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

    public List<ExcludedPaymentMethod> getExcludedPaymentMethods() {
        return excludedPaymentMethods;
    }

    public void setExcludedPaymentMethods(List<ExcludedPaymentMethod> excludedPaymentMethods) {
        this.excludedPaymentMethods = excludedPaymentMethods;
    }

    public List<ExcludedPaymentType> getExcludedPaymentTypes() {
        return excludedPaymentTypes;
    }

    public void setExcludedPaymentTypes(List<ExcludedPaymentType> excludedPaymentTypes) {
        this.excludedPaymentTypes = excludedPaymentTypes;
    }

    public Object getInstallments() {
        return installments;
    }

    public void setInstallments(Object installments) {
        this.installments = installments;
    }

    public Object getDefaultPaymentMethodId() {
        return defaultPaymentMethodId;
    }

    public void setDefaultPaymentMethodId(Object defaultPaymentMethodId) {
        this.defaultPaymentMethodId = defaultPaymentMethodId;
    }

    public Object getDefaultInstallments() {
        return defaultInstallments;
    }

    public void setDefaultInstallments(Object defaultInstallments) {
        this.defaultInstallments = defaultInstallments;
    }

}
