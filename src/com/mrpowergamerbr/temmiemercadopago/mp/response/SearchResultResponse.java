
package com.mrpowergamerbr.temmiemercadopago.mp.response;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.Paging;
import com.mrpowergamerbr.temmiemercadopago.mp.utils.Result;

import lombok.Getter;

@Getter
public class SearchResultResponse {
    @SerializedName("paging")
    @Expose
    private Paging paging;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
}
