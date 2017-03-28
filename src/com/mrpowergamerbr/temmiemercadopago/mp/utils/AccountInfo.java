package com.mrpowergamerbr.temmiemercadopago.mp.utils;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import lombok.Getter;

@Getter
public class AccountInfo {
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("nickname")
    @Expose
    private String nickname;
    @SerializedName("registration_date")
    @Expose
    private String registrationDate;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("country_id")
    @Expose
    private String countryId;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("identification")
    @Expose
    private Identification identification;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("phone")
    @Expose
    private Phone phone;
    @SerializedName("alternative_phone")
    @Expose
    private AlternativePhone alternativePhone;
    @SerializedName("user_type")
    @Expose
    private String userType;
    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("logo")
    @Expose
    private Object logo;
    @SerializedName("points")
    @Expose
    private Integer points;
    @SerializedName("site_id")
    @Expose
    private String siteId;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("shipping_modes")
    @Expose
    private List<String> shippingModes = null;
    @SerializedName("seller_experience")
    @Expose
    private String sellerExperience;
    @SerializedName("bill_data")
    @Expose
    private BillData billData;
    @SerializedName("seller_reputation")
    @Expose
    private SellerReputation sellerReputation;
    @SerializedName("buyer_reputation")
    @Expose
    private BuyerReputation buyerReputation;
    @SerializedName("status")
    @Expose
    private Status status;
    @SerializedName("company")
    @Expose
    private Company company;
    @SerializedName("credit")
    @Expose
    private Credit credit;
    @SerializedName("context")
    @Expose
    private Context context;
    @SerializedName("thumbnail")
    @Expose
    private Thumbnail thumbnail;
}
