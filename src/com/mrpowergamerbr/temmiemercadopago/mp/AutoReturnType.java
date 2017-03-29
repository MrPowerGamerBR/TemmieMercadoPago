package com.mrpowergamerbr.temmiemercadopago.mp;

import lombok.Getter;

@Getter
public enum AutoReturnType {
	APPROVED("approved"),
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
