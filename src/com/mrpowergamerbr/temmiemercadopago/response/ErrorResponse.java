package com.mrpowergamerbr.temmiemercadopago.response;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ErrorResponse implements Response {
	@SerializedName("message")
	String message;
	
	@SerializedName("error")
	String error;
	
	@SerializedName("status")
	int status;
}
