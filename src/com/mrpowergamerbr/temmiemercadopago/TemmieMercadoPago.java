package com.mrpowergamerbr.temmiemercadopago;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.mrpowergamerbr.temmiemercadopago.exception.MercadoPagoException;
import com.mrpowergamerbr.temmiemercadopago.internal.Endpoints;
import com.mrpowergamerbr.temmiemercadopago.mp.Payment;
import com.mrpowergamerbr.temmiemercadopago.mp.TemmieItem;
import com.mrpowergamerbr.temmiemercadopago.mp.request.PaymentRequest;
import com.mrpowergamerbr.temmiemercadopago.mp.response.AccessTokenResponse;
import com.mrpowergamerbr.temmiemercadopago.mp.response.ErrorResponse;
import com.mrpowergamerbr.temmiemercadopago.mp.response.SearchResultResponse;

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

	public Payment generatePayment(TemmieItem... items) {
		PaymentRequest request = new PaymentRequest();

		for (TemmieItem item : items) {
			request.getItems().add(item);
		}

		String response = HttpRequest.post(Endpoints.MP_API_URL + "/checkout/preferences?access_token=" + getAccessToken())
				.acceptJson()
				.contentType("application/json")
				.send(gson.toJson(request))
				.body();

		System.out.println(response);
		Payment realPayment = gson.fromJson(response, Payment.class);

		return realPayment;
	}

	public SearchResultResponse searchPayments() {
		return searchPayments(new HashMap<String, Object>());
	}

	public SearchResultResponse searchPayments(String country) {
		return searchPayments(new HashMap<String, Object>(), country);
	}

	public SearchResultResponse searchPayments(Map<String, Object> filters, String country) {
		return searchPayments(filters, country, 0, 0);
	}

	public SearchResultResponse searchPayments(Map<String, Object> filters) {
		return searchPayments(filters, null);
	}

	public SearchResultResponse searchPayments(Map<String, Object> filters, String country, long offset, long limit) {
		if (country != null) {
			filters.put("site_id", country); // Argentina: MLA; Brasil: MLB; Mexico: MLM; Venezuela: MLV; Colombia: MCO
		}

		filters.put("offset", offset);
		filters.put("limit", limit);

		String response = HttpRequest.get(Endpoints.MP_API_URL + "/collections/search?" + buildQuery(filters) + "&access_token=" + getAccessToken())
				.acceptJson()
				.contentType("application/json")
				.body();

		return gson.fromJson(response, SearchResultResponse.class);
	}

	public SearchResultResponse searchAllPayments() {
		return searchAllPayments(new HashMap<String, Object>(), null);
	}

	public SearchResultResponse searchAllPayments(Map<String, Object> filters) {
		return searchAllPayments(filters, null);
	}

	public SearchResultResponse searchAllPayments(Map<String, Object> filters, String country) {
		return searchAllPayments(filters, country, 0);
	}

	private SearchResultResponse searchAllPayments(Map<String, Object> filters, String country, int offset) {
		SearchResultResponse psr = searchPayments(filters, country, 0, 1000);
		if (psr.getPaging().total >= offset) {
			offset = offset + 1000;
			SearchResultResponse aux = searchPayments(filters, country, offset, 1000);
			psr.getResults().addAll(aux.getResults());
		}
		return psr;
	}

	private String buildQuery(Map<String, Object> params) {
		String[] query = new String[params.size()];
		int index = 0;
		for (String key : params.keySet()) {
			String val = String.valueOf(params.get(key) != null ? params.get(key) : "");
			try {
				val = URLEncoder.encode(val, "UTF-8");
			} catch (UnsupportedEncodingException e) {
			}
			query[index++] = key+"="+val;
		}

		return StringUtils.join(query, "&");
	}
}
