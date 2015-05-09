package com.example.android.tvleanback.model;

import com.google.gson.annotations.SerializedName;

public class Section {

    //linkUrl: String
    @SerializedName("linkUrl")
    public String linkUrl;

    @SerializedName("type")
    public String type;

    @SerializedName("title")
    public String title;
}
