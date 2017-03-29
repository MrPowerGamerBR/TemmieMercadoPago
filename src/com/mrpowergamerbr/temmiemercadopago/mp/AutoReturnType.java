package com.mrpowergamerbr.temmiemercadopago.mp;

import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public enum AutoReturnType {
	@SerializedName("approved")
	APPROVED("approved"),
	@SerializedName("all")
	ALL("all");
	
	private String mpStatus;
	
	AutoReturnType(String mpStatus) {
		this.mpStatus = mpStatus;
	}

	public static AutoReturnType getPaymentStatusByMPValue(String mpValue) {
		for (AutoReturnType val : values()) {
			if (val.getMpStatus().equals(mpValue)) {
				return val;
			}
		}
		return null;
	}
}
