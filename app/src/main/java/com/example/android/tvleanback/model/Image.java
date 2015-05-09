package com.example.android.tvleanback.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Image {

    //pufferPath: String
    @SerializedName("pufferPath")
    public String pufferPath;

    //versions: List
    @SerializedName("versions")
    public List<ImageVersion> versions;

    //photographer: String
    @SerializedName("photographer")
    public String photographer;

    //text: String
    @SerializedName("text")
    public String text;


}
