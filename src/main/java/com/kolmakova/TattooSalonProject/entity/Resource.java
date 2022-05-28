package com.kolmakova.TattooSalonProject.entity;

import java.io.InputStream;

public class Resource extends AbstractEntity {
    private InputStream content;
    private int id;
    private String url;

    public InputStream getContent() {
        return content;
    }

    public void setContent(InputStream content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
