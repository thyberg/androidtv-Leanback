package se.expressen.tvleanback.data;

import android.content.res.AssetManager;

import se.expressen.tvleanback.model.LatestNews;
import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;


public class FlotsamParser {
    private static final String LOG_TAG = FlotsamParser.class.getSimpleName();
    private AssetManager mAssetManager;

    public FlotsamParser(AssetManager assetManager) {
        this.mAssetManager = assetManager;
    }

    public LatestNews getLatestNews(final String section, final String fileName) {
        String json = loadJSONFromAsset(fileName);

        Gson gson = new Gson();
        final LatestNews latestNews = gson.fromJson(json, LatestNews.class);
        latestNews.section = section;
        return latestNews;
    }

    public String loadJSONFromAsset(final String fileName) {
        String json = null;
        try {

            InputStream is = mAssetManager.open(fileName);

            int size = is.available();

            byte[] buffer = new byte[size];

            is.read(buffer);

            is.close();

            json = new String(buffer, "UTF-8");


        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;

    }
}
