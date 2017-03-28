
package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BuyerReputation {

    @SerializedName("canceled_transactions")
    @Expose
    public Integer canceledTransactions;
    @SerializedName("transactions")
    @Expose
    public Transactions transactions;
    @SerializedName("tags")
    @Expose
    public List<String> tags = null;

}
