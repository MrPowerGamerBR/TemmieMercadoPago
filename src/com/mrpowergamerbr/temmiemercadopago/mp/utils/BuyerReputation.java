package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class BuyerReputation {
    @SerializedName("canceled_transactions")
    @Expose
    private Integer canceledTransactions;
    @SerializedName("transactions")
    @Expose
    private Transactions transactions;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
}
