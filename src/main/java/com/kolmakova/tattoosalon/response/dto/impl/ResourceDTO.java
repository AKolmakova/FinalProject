package com.kolmakova.tattoosalon.response.dto.impl;

import com.kolmakova.tattoosalon.response.dto.EntityDTO;

import java.io.InputStream;

public class ResourceDTO implements EntityDTO {

    private InputStream inputStream;
    private byte[] content;
    private Integer id;
    private String url;


    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
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

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

}
