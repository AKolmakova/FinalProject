package com.kolmakova.tattoosalon.response.responceservice.impl;

import com.kolmakova.tattoosalon.entity.impl.DynamicContent;
import com.kolmakova.tattoosalon.response.dto.impl.DynamicContentDTO;
import com.kolmakova.tattoosalon.response.entity.DCResponse;
import com.kolmakova.tattoosalon.response.responceservice.DCResponseService;
import com.kolmakova.tattoosalon.service.DCService;
import com.kolmakova.tattoosalon.util.Converter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DCResponseServiceImpl implements DCResponseService {

    @Autowired
    private DCService dynamicContentService;

    @Autowired
    private Converter<DynamicContent, DynamicContentDTO> dcConverter;

    @Override
    public DCResponse getDCResponse() {
        DCResponse dynamicContentResponse = new DCResponse();

        List<DynamicContent> bannerDynamicContent = dynamicContentService.getBannerContent();
        List<DynamicContent> advertisingDynamicContent = dynamicContentService.getAdvertisingContent();

        List<DynamicContentDTO> bannerDynamicContentList = dcConverter.convertToDTOList(bannerDynamicContent);
        List<DynamicContentDTO> advertisingDynamicContentList = dcConverter.convertToDTOList(advertisingDynamicContent);

        dynamicContentResponse.setBannerDCList(bannerDynamicContentList);
        dynamicContentResponse.setAdvertisingDCList(advertisingDynamicContentList);

        return dynamicContentResponse;

    }
}
