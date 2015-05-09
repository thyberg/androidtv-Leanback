package com.example.android.tvleanback.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by asmsabex on 19/03/15.
 */
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
