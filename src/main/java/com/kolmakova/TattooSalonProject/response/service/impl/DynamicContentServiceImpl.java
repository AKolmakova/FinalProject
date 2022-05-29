package com.kolmakova.TattooSalonProject.response.service.impl;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.dao.Query;
import com.kolmakova.TattooSalonProject.dao.impl.DynamicContentDAOImpl;
import com.kolmakova.TattooSalonProject.dao.mapper.DynamicContentMapper;
import com.kolmakova.TattooSalonProject.entity.DynamicContent;
import com.kolmakova.TattooSalonProject.response.service.DynamicContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DynamicContentServiceImpl implements DynamicContentService {

    @Autowired
    private AbstractDAO<DynamicContent> abstractDAOPictures;

    @Override
    public List<DynamicContent> getBannerContent() {

        return abstractDAOPictures.findAll("SELECT * FROM %s WHERE %s='banner'",tableName,rowMapper);
    }

    @Override
    public List<DynamicContent> getAdvertisingContent() {
        return abstractDAOPictures.findAll();
    }
}
