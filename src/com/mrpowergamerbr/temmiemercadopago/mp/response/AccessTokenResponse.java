package com.mrpowergamerbr.temmiemercadopago.mp.response;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class AccessTokenResponse implements Response {
	@SerializedName("access_token")
	String accessToken;
	
	@SerializedName("refresh_token")
	String refreshToken;
	
	@SerializedName("live_mode")
	boolean liveMode;
	
	@SerializedName("user_id")
	int userId;
	
	@SerializedName("token_type")
	String tokenType;
	
	@SerializedName("expires_in")
	int expiresIn;
	
	@SerializedName("scope")
	String scope;
}
