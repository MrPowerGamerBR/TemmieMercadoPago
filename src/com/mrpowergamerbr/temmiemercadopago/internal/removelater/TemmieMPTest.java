package com.mrpowergamerbr.temmiemercadopago.internal.removelater;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.mrpowergamerbr.temmiemercadopago.TemmieMercadoPago;
import com.mrpowergamerbr.temmiemercadopago.mp.AutoReturnType;
import com.mrpowergamerbr.temmiemercadopago.mp.Payment;
import com.mrpowergamerbr.temmiemercadopago.mp.TemmieItem;
import com.mrpowergamerbr.temmiemercadopago.mp.request.PaymentRequest;
import com.mrpowergamerbr.temmiemercadopago.mp.response.SearchResultResponse;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.BackUrls;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.Identification;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.Payer;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.Result;

public class TemmieMPTest {
	public static void main(String[] args) {
		String clientId = null;
		String clientToken = null;
		try (BufferedReader br = new BufferedReader(new FileReader(new File("D:\\mp_api.txt")))) {

			String sCurrentLine;

			while ((sCurrentLine = br.readLine()) != null) {
				if (clientId == null) {
					clientId = sCurrentLine;
				} else if (clientToken == null) {
					clientToken = sCurrentLine;
				} else {
					break;
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		TemmieMercadoPago temmie = new TemmieMercadoPago(clientId, clientToken);

		Payment payment = temmie.generatePayment(PaymentRequest.builder()
				.addItem(
						TemmieItem.builder()
						.title("1000 Granas") // Nome do pagamento
						.unitPrice(0.99) // Preço
						.quantity(1) // Quantidade
						.categoryId("virtual_goods") // https://api.mercadopago.com/item_categories
						.build()
						)
				.externalReference("MrPowerGamerBR") // Nome do player que comprou
				.build());

		System.out.println(payment.getInitPoint()); // Link do pagamento
		
		SearchResultResponse srr = temmie.searchAllPayments();
		for (Result r : srr.getResults()) {
			System.out.println(r.getCollection().getExternalReference());
		}
	}
}
