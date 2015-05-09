package com.example.android.tvleanback.model;

import com.google.gson.annotations.SerializedName;

public class Stream {

    //android: String
    @SerializedName("android")
    public String android;

    @SerializedName("iPhone")
    public String live;

    @SerializedName("iPad")
    public String iPad;

    @SerializedName("high")
    public String high;
}
