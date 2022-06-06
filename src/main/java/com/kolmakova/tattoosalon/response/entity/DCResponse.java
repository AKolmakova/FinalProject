package com.kolmakova.tattoosalon.response.entity;

import com.kolmakova.tattoosalon.response.dto.impl.DynamicContentDTO;

import java.util.List;

public class DCResponse {

    private List<DynamicContentDTO> bannerDCList;
    private List<DynamicContentDTO> advertisingDCList;

    public List<DynamicContentDTO> getBannerDCList() {
        return bannerDCList;
    }

    public void setBannerDCList(List<DynamicContentDTO> bannerDCList) {
        this.bannerDCList = bannerDCList;
    }

    public List<DynamicContentDTO> getAdvertisingDCList() {
        return advertisingDCList;
    }

    public void setAdvertisingDCList(List<DynamicContentDTO> advertisingDCList) {
        this.advertisingDCList = advertisingDCList;
    }
}
