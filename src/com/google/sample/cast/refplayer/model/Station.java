package com.google.sample.cast.refplayer.model;

public class Station {
    private String name;
    private String image;
    private String url;
    private String referer;
    private Boolean embed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
    }

    public Boolean getEmbed() {
        return embed;
    }

    public void setEmbed(Boolean embed) {
        this.embed = embed;
    }
}
