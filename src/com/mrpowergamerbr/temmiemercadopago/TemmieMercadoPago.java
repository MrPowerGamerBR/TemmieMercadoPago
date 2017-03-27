package com.mrpowergamerbr.temmiemercadopago;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.mrpowergamerbr.temmiemercadopago.exception.MercadoPagoException;
import com.mrpowergamerbr.temmiemercadopago.internal.Endpoints;
import com.mrpowergamerbr.temmiemercadopago.mp.Payment;
import com.mrpowergamerbr.temmiemercadopago.mp.TemmiePayment;
import com.mrpowergamerbr.temmiemercadopago.mp.request.PaymentRequest;
import com.mrpowergamerbr.temmiemercadopago.mp.response.AccessTokenResponse;
import com.mrpowergamerbr.temmiemercadopago.mp.response.ErrorResponse;

import lombok.*;

public class TemmieMercadoPago {
	@Getter
	public static final Gson gson = new Gson();
	@Getter
	@Setter
	private String clientId;
	@Getter
	@Setter
	private String clientToken;

	public TemmieMercadoPago(String clientId, String clientToken) {
		this.clientId = clientId;
		this.clientToken = clientToken;
	}

	public AccessTokenResponse getAccessTokenResponse() {
		String json = HttpRequest.post(Endpoints.MP_API_URL + "/oauth/token")
				.part("grant_type", "client_credentials")
				.part("client_id", this.getClientId())
				.part("client_secret", this.getClientToken())
				.body();

		System.out.println(json);

		AccessTokenResponse response = gson.fromJson(json, AccessTokenResponse.class);

		if (response.getAccessToken() == null) {
			ErrorResponse errResponse = gson.fromJson(json, ErrorResponse.class);
			throw new MercadoPagoException(errResponse.getMessage());
		}

		return response;
	}

	public String getAccessToken() {
		return getAccessTokenResponse().getAccessToken();
	}

	public Payment generatePayment(TemmiePayment payment) {
		PaymentRequest request = new PaymentRequest();
		request.getItems().add(payment);

		String response = HttpRequest.post(Endpoints.MP_API_URL + "/checkout/preferences?access_token=" + getAccessToken())
				.acceptJson()
				.contentType("application/json")
				.send(gson.toJson(request))
				.body();
		
		Payment realPayment = gson.fromJson(response, Payment.class);
		
		return realPayment;
	}
}
