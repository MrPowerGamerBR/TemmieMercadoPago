package com.mrpowergamerbr.temmiemercadopago.mp.request;

import java.util.ArrayList;
import java.util.List;

import com.mrpowergamerbr.temmiemercadopago.mp.TemmiePayment;

import lombok.Getter;

@Getter
public class PaymentRequest {
	List<TemmiePayment> items = new ArrayList<TemmiePayment>();
}
