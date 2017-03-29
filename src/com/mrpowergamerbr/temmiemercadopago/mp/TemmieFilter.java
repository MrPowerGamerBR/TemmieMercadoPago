package com.mrpowergamerbr.temmiemercadopago.mp;

import java.util.HashMap;

public class TemmieFilter {
	HashMap<String, String> backedMap = new HashMap<String, String>();

	public static TemmieFilter builder() {
		return new TemmieFilter();
	}
	
	public TemmieFilter withId(long id) {
		backedMap.put("id", String.valueOf(id));
		return this;
	}
	
	public TemmieFilter withSiteId(String country) {
		backedMap.put("site_id", country);
		return this;
	}
	
	public TemmieFilter withUserId(String userId) {
		backedMap.put("user_id", String.valueOf( userId));
		return this;
	}
	// TODO: date_created & date_released
	
	public TemmieFilter withType(String type) {
		backedMap.put("type", String.valueOf(type));
		return this;
	}
	
	public TemmieFilter withDetail(String detail) {
		backedMap.put("detail", String.valueOf(detail));
		return this;
	}
	
	public TemmieFilter withAmount(double amount) {
		backedMap.put("amount", String.valueOf(amount));
		return this;
	}
	
	public TemmieFilter withCurrencyId(String currencyId) {
		backedMap.put("currency_id", String.valueOf(currencyId));
		return this;
	}
	
	public TemmieFilter withReferenceId(String referenceId) {
		backedMap.put("reference_id", String.valueOf(referenceId));
		return this;
	}
	
	public TemmieFilter withFinancialEntity(String financialEntity) {
		backedMap.put("financial_entity", String.valueOf(financialEntity));
		return this;
	}
	
	public TemmieFilter withStatus(String status) {
		backedMap.put("status", String.valueOf(status));
		return this;
	}
	
	public TemmieFilter withLabel(String label) {
		backedMap.put("label", String.valueOf(label));
		return this;
	}
	
	public TemmieFilter withOriginalMoveId(String originalMoveId) {
		backedMap.put("original_move_id", String.valueOf(originalMoveId));
		return this;
	}
	
	public HashMap<String, String> build() {
		return backedMap;
	}
}
