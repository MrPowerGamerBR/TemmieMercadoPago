package com.mrpowergamerbr.temmiemercadopago.mp;

import com.google.gson.annotations.SerializedName;

import lombok.AllArgsConstructor;
import lombok.Builder;

@AllArgsConstructor
@Builder
// TODO: Better name
public class TemmiePayment {
	String name;
	@SerializedName("unit_price")
	double unitPrice;
	int quantity;
	String currencyId;
}
