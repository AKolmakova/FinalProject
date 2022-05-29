package com.kolmakova.TattooSalonProject.dao.impl;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.dao.Query;
import com.kolmakova.TattooSalonProject.entity.DynamicContent;
import org.springframework.stereotype.Component;

@Component
public class DynamicContentDAOImpl extends AbstractDAO<DynamicContent> {
    private static final String TABLE_NAME = "dynamic_content";

    @Override
    protected Query getSaveQuery(DynamicContent dynamicContent) {
        return null;
    }

    @Override
    protected Query getUpdateQuery(DynamicContent dynamicContent) {
        return null;
    }

    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }
}
