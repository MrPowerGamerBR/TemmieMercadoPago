
package com.mrpowergamerbr.temmiemercadopago.mp;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class TemmieItem {
	@SerializedName("id")
	String id;
    @SerializedName("title")
    private String title;
    @SerializedName("description")
    private String description;
    @SerializedName("picture_url")
    private String pictureUrl;
    @SerializedName("category_id")
    private String categoryId;
    @SerializedName("currency_id")
    private transient String currencyId;
    @SerializedName("quantity")
    private Integer quantity;
    @SerializedName("unit_price")
    private double unitPrice;
    
    public TemmieItem(String title, int quantity, double unitPrice) {
    	this(title, quantity, unitPrice, "BRL");
    }
    
    public TemmieItem(String title, int quantity, double unitPrice, String currencyId) {
    	this.title = title;
    	this.quantity = quantity;
    	this.unitPrice = unitPrice;
    	this.currencyId = currencyId;
    }
}
