package com.kolmakova.tattoosalon.service.impl;

import com.kolmakova.tattoosalon.dao.impl.DynamicContentDAO;
import com.kolmakova.tattoosalon.entity.impl.DynamicContent;
import com.kolmakova.tattoosalon.service.DCService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DynamicContentServiceImpl implements DCService {

    @Autowired
    private DynamicContentDAO dynamicContentDAO;

    @Override
    public List<DynamicContent> getBannerContent() {
        return dynamicContentDAO.getBannerContent();
    }

    @Override
    public List<DynamicContent> getAdvertisingContent() {
        return dynamicContentDAO.getAdvertisingContent();
    }
}
