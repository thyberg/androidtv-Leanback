package se.expressen.tvleanback.model;

import com.google.gson.annotations.SerializedName;

public class ImageVersion {

    //aspectRatio: String
    @SerializedName("aspectRatio")
    public String aspectRatio;

    //width: Integer
    @SerializedName("width")
    public Integer width;

    //height: Integer
    @SerializedName("height")
    public Integer height;

    //url: String
    @SerializedName("url")
    public String imageUrl;

}
