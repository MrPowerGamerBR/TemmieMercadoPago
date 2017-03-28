package com.mrpowergamerbr.temmiemercadopago.mp;

import lombok.Getter;

@Getter
public enum PaymentStatus {
	PENDING("pending"),
	APPROVED("approved"),
	IN_PROCESS("in_process"),
	IN_MEDIATION("in_mediation"),
	REJECTED("rejected"),
	CANCELLED("cancelled"),
	REFUNDED("refunded"),
	CHARGED_BACK("charged_back"),
	UNKNOWN("unknown");
	
	private String mpStatus;
	
	PaymentStatus(String mpStatus) {
		this.mpStatus = mpStatus;
	}

	public static PaymentStatus getPaymentStatusByMPStatus(String mpStatus) {
		for (PaymentStatus val : values()) {
			if (val.getMpStatus().equals(mpStatus)) {
				return val;
			}
		}
		return PaymentStatus.UNKNOWN;
	}
}
