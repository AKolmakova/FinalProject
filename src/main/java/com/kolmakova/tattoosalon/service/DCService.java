package com.kolmakova.tattoosalon.service;


import com.kolmakova.tattoosalon.entity.impl.DynamicContent;

import java.util.List;

public interface DCService {
    List<DynamicContent> getBannerContent();

    List<DynamicContent> getAdvertisingContent();
}
