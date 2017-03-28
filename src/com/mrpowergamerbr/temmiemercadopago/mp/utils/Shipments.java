package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class Shipments {
    @SerializedName("receiver_address")
    @Expose
    private ReceiverAddress receiverAddress;
}
