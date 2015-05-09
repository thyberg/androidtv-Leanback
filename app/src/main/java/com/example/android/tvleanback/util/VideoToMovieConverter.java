package com.example.android.tvleanback.util;

import android.provider.MediaStore;

import com.example.android.tvleanback.model.Movie;
import com.example.android.tvleanback.model.Video;

import java.util.ArrayList;
import java.util.List;

public class VideoToMovieConverter {
    public static Movie convert(final Video video) {
        return new Movie(
            video.contentId,
            video.headline,
            video.subHeadline,
            video.image.versions.get(3).imageUrl,
            video.image.versions.get(3).imageUrl,
            video.streams.iPad,
            "Expressen",
            video.section.title
        );
    }

    public static Movie createDummyMovie(final Video video) {
        return new Movie(
            "6233199",
            "Avicii \u2013 Feeling Good",
            "H\u00e4r \u00e4r hela Aviciis nya Volvo-reklam som Expressen nu kan visa.",
            "http://w.cdn-expressen.se/images/f0/9f/f09fc9ec73cc4ad9a7928d1c32640748/16x9/original.jpg",
            "http://w.cdn-expressen.se/images/f0/9f/f09fc9ec73cc4ad9a7928d1c32640748/16x9/original.jpg",
            "http://417766ba872dedbaf3ead3c73ff90d43.httpcache0.03837-httpcache0.dna.qbrick.com/03837-httpcache0/_definst_/smil:ncode/2015-05-08/expr3c6e4a6ab62e4fc59039c5b032446bd7_3_ipad/playlist.m3u8",
//            "http://down0.03837-down0.dna.qbrick.com/03837-down0/ncode/2015-05-08/expr3c6e4a6ab62e4fc59039c5b032446bd7_3_400.mp4",
            "Expressen",
            "Nöje"
        );
    }

    public static List<Movie> convert(final List<Video> videos) {
        final List<Movie> list = new ArrayList<>();

        for (final Video video : videos) {
            list.add(convert(video));
        }

        return list;
    }
}
