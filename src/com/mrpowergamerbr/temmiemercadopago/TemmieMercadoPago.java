package com.mrpowergamerbr.temmiemercadopago;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import com.github.kevinsawicki.http.HttpRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mrpowergamerbr.temmiemercadopago.exception.MercadoPagoException;
import com.mrpowergamerbr.temmiemercadopago.internal.Endpoints;
import com.mrpowergamerbr.temmiemercadopago.internal.PostProcessingEnabler;
import com.mrpowergamerbr.temmiemercadopago.mp.Payment;
import com.mrpowergamerbr.temmiemercadopago.mp.TemmieItem;
import com.mrpowergamerbr.temmiemercadopago.mp.TemmiePreapproval;
import com.mrpowergamerbr.temmiemercadopago.mp.request.PaymentRequest;
import com.mrpowergamerbr.temmiemercadopago.mp.response.AccessTokenResponse;
import com.mrpowergamerbr.temmiemercadopago.mp.response.ErrorResponse;
import com.mrpowergamerbr.temmiemercadopago.mp.response.SearchResultResponse;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.AccountInfo;
import lombok.*;

/**
 * MercadoPago unofficial integration library
 * 
 * @author MrPowerGamerBR
 */
public class TemmieMercadoPago {
	@Getter
	public static final Gson gson = new GsonBuilder().serializeNulls().registerTypeAdapterFactory(new PostProcessingEnabler()).create();
	@Getter
	@Setter
	private String clientId;
	@Getter
	@Setter
	private String clientToken;

	/**
	 * Initialize a TemmieMercadoPago Client with credientials
	 * 
	 * You can get your client id and client token here: https://www.mercadopago.com.br/developers/pt/api-docs/basics/authentication
	 * 
	 * @param clientId - MercadoPago's client id
	 * @param clientToken - MercadoPago's client token
	 */
	public TemmieMercadoPago(String clientId, String clientToken) {
		this.clientId = clientId;
		this.clientToken = clientToken;
	}

	/**
	 * Gets the access token response for this client id and client token
	 * 
	 * @return the access token response
	 */
	public AccessTokenResponse getAccessTokenResponse() {
		String json = HttpRequest.post(Endpoints.MP_API_URL + "/oauth/token")
				.part("grant_type", "client_credentials")
				.part("client_id", this.getClientId())
				.part("client_secret", this.getClientToken())
				.body();
		
		// Check if it is an error message
		ErrorResponse errResponse = gson.fromJson(json, ErrorResponse.class);
		
		if (errResponse.getMessage() != null) {
			throw new MercadoPagoException(errResponse.getMessage());
		}
		
		AccessTokenResponse response = gson.fromJson(json, AccessTokenResponse.class);

		return response;
	}

	/**
	 * Gets the access token for this client id and client token
	 * 
	 * @return the access token
	 */
	public String getAccessToken() {
		return getAccessTokenResponse().getAccessToken();
	}

	public Payment generatePayment(PaymentRequest paymentRequest) {
		String response = HttpRequest.post(Endpoints.MP_API_URL + "/checkout/preferences?access_token=" + getAccessToken())
				.acceptJson()
				.contentType("application/json")
				.send(gson.toJson(paymentRequest))
				.body();

		// Check if it is an error message
		ErrorResponse errResponse = gson.fromJson(response, ErrorResponse.class);
		
		if (errResponse.getMessage() != null) {
			throw new MercadoPagoException(errResponse.getMessage());
		}
		
		Payment realPayment = gson.fromJson(response, Payment.class);

		return realPayment;
	}
	
	public Payment generatePayment(TemmieItem... items) {
		PaymentRequest request = PaymentRequest.builder()
				.items(Arrays.asList(items))
				.build();
		
		return generatePayment(request);
	}

	// TODO: Finish this
	public void getPaymentInfoById(long paymentId) {
		String response = HttpRequest.get(Endpoints.MP_API_URL + "/v1/payments/" + paymentId + "?access_token=" + getAccessToken())
				.acceptJson()
				.contentType("application/json")
				.body();

		// Check if it is an error message
		/* ErrorResponse errResponse = gson.fromJson(response, ErrorResponse.class);
		
		if (errResponse.getMessage() != null) {
			throw new MercadoPagoException(errResponse.getMessage());
		} */
		
		System.out.println(response);
		
		return;
	}
	
	// TODO: Subscription info
	public void generatePreapproval() {
		String response = HttpRequest.post(Endpoints.MP_API_URL + "/preapproval/?access_token=" + getAccessToken())
				.acceptJson()
				.contentType("application/json")
				.send(gson.toJson(new TemmiePreapproval()))
				.body();
		
		System.out.println(response);
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

		System.out.println(response);
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
		if (psr.getPaging().getTotal() >= offset) {
			offset = offset + 1000;
			SearchResultResponse aux = searchPayments(filters, country, offset, 1000);
			psr.getResults().addAll(aux.getResults());
		}
		return psr;
	}

	public AccountInfo getAccountInfo() {
		String response = HttpRequest.get(Endpoints.MP_API_URL + "/users/me?access_token=" + getAccessToken())
				.acceptJson()
				.contentType("application/json")
				.body();
		
		return gson.fromJson(response, AccountInfo.class);
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
