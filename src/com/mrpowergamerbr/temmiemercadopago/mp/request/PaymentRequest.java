package com.mrpowergamerbr.temmiemercadopago.mp.request;

import java.util.ArrayList;
import java.util.List;

import com.mrpowergamerbr.temmiemercadopago.mp.TemmieItem;

import lombok.Getter;

@Getter
public class PaymentRequest {
	List<TemmieItem> items = new ArrayList<TemmieItem>();
}
