package com.kolmakova.TattooSalonProject.dao.impl;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.dao.Query;
import com.kolmakova.TattooSalonProject.entity.Resource;
import org.springframework.stereotype.Component;

@Component
public class ResourceDAOImpl extends AbstractDAO<Resource> {
    private static final String TABLE_NAME = "resource";

    @Override
    protected Query getSaveQuery(Resource resource) {
        return null;
    }

    @Override
    protected Query getUpdateQuery(Resource resource) {
        return null;
    }

    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }
}
