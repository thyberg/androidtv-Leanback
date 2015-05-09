package se.expressen.tvleanback.model;

import com.google.gson.annotations.SerializedName;


import java.util.List;

/**
 * Created by Lukas Robertsson on 2015-05-09.
 */
//{
//    "type":"latest-news",
//    "self":"https://content.expressen.se/latest-news/webtv-section/d463f319-2693-4b7b-cdc0-92122b5c8cf9",
//    "items":[  ],
//    "count":20,
//    "next":{
//    "self":"https://content.expressen.se/latest-news/webtv-section/d463f319-2693-4b7b-cdc0-92122b5c8cf9?page=2"
//    }
//    }
public class LatestNews {
    public String section;

    @SerializedName("items")
    public List<Video> videos;

}

