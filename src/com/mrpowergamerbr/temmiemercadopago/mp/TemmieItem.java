
package com.mrpowergamerbr.temmiemercadopago.mp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TemmieItem {
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("currency_id")
    @Deprecated
    /**
     * Unused, returns invalid currencyId when used
     */
    private transient String currencyId;
    @SerializedName("quantity")
    @Expose
    private Integer quantity;
    @SerializedName("unit_price")
    @Expose
    private double unitPrice;
    
    public TemmieItem(String title, int quantity, double unitPrice) {
    	this(title, quantity, unitPrice, CurrencyIdentifier.BRASIL);
    }
    
    public TemmieItem(String title, int quantity, double unitPrice, String currencyId) {
    	this.title = title;
    	this.quantity = quantity;
    	this.unitPrice = unitPrice;
    	this.currencyId = currencyId;
    }
}
