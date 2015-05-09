package com.example.android.tvleanback.model;

import android.graphics.Bitmap;

import com.google.gson.annotations.SerializedName;

public class Video {

    public Bitmap imageBitmap;

    //section: JSON object
    @SerializedName("section")
    public Section section;

    @SerializedName("publishDate")
    public String publishDate;

    //headline: String
    @SerializedName("headline")
    public String headline;

    //totalSecondsDuration: Int
    @SerializedName("totalSecondsDuration")
    public int totalSecondsDuration;

    //subHeadline: String
    @SerializedName("subHeadline")
    public String subHeadline;

    @SerializedName("type")
    public String type;

    @SerializedName("self")
    public String self;

    public String getSection() {
        String[] parts = section.linkUrl.split("/");
        return parts[parts.length -1];
    }
    @SerializedName("image")
    public Image image;

    //omnitureVideoId: String
    @SerializedName("omnitureVideoId")
    public String contentId;

    //omnitureId: String
    @SerializedName("omnitureId")
    public String omnitureId;

    @SerializedName("externalPath")
    public String externalPath;

    //adsDisabled: boolean
    @SerializedName("adsDisabled")
    public boolean adsDisabled;

    @SerializedName("streams")
    public Stream streams;

    //isPremium: boolean
    @SerializedName("isPremium")
    public boolean isPremium;

    //isLive: boolean
    @SerializedName("isLive")
    public boolean isLive;

    public String contentPartner = null;

    public boolean trackedFirstQ;
    public boolean trackedSecondQ;
    public boolean trackedThirdQ;

    public String imageUrl;

    private String subsection;
    private String subsection1;
    private String subsection2;

    public String getSubsection() {
        if (subsection != null) {
            return subsection;
        }
        else {
            parseSection();
            return subsection;
        }
    }

    public String getSubsection1() {
        if (subsection1 != null) {
            return subsection1;
        }
        else {
            parseSection();
            return subsection1;
        }
    }

    public String getSubsection2() {
        if (subsection2 != null) {
            return subsection2;
        }
        else {
            parseSection();
            return subsection2;
        }
    }

    public String getPageName() {
        parseSection();
        if (subsection2 != null) {
            return subsection2 + ":";
        }
        else if (subsection1 != null) {
            return subsection1 + ":";
        }
        else {
            return subsection + ":";
        }
    }

    private void parseSection() {
        String[] parts = section.linkUrl.split("/");
        if (parts.length > 4) {
            subsection = parts[parts.length - 3];
            subsection1 = subsection + ":" + parts[parts.length - 2];
            subsection2 = subsection1 + ":" + parts[parts.length - 1];
        }
        else if (parts.length > 3) {
            subsection = parts[parts.length - 2];
            subsection1 = subsection + ":" + parts[parts.length - 1];
        }
        else {
            subsection = parts[parts.length - 1];
        }
    }
}
