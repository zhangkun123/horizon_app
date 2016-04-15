package com.laioffer.horizon;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David Chen on 1/31/2016.
 */

public class News {

    private String id;
    private String title;
    private String url;
    private String snippet;
    private String imageUrl;
    private List<String> keywords;
    private boolean isVisited;

    public News(String id, String title, String url, String snippet,
                String imageUrl, List<String> keywords, boolean isVisited) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.snippet = snippet;
        this.imageUrl = imageUrl;
        this.keywords = keywords;
        this.isVisited = isVisited;
    }

    /**
     * Construct a News object from a JSONObject
     */
    public News(JSONObject jsonObject) {
        try {
            this.id = jsonObject.getString("id");
            this.title = jsonObject.getString("title");
            this.url = jsonObject.getString("url");
            this.snippet = jsonObject.getString("snippet");
            this.imageUrl = jsonObject.getString("imageUrl");
            JSONArray array = jsonObject.getJSONArray("keywords");
            this.keywords = new ArrayList<>();
            for (int i = 0; i < array.length(); i++) {
                this.keywords.add(array.getString(i));
            }
            this.isVisited = jsonObject.getBoolean("is_visited");
        } catch (Exception e) {
            System.out.println("Exception in converting a JSON object to a News object");
            e.printStackTrace();
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public boolean getIsVisited() {
        return isVisited;
    }

    public void setIsVisited(boolean isVisited) {
        this.isVisited = isVisited;
    }

}