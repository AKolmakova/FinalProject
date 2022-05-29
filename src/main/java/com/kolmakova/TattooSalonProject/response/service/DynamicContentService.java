package com.kolmakova.TattooSalonProject.response.service;
import com.kolmakova.TattooSalonProject.entity.DynamicContent;

import java.util.List;


public interface DynamicContentService {
    List<DynamicContent> getBannerContent();

    List<DynamicContent> getAdvertisingContent();

}
