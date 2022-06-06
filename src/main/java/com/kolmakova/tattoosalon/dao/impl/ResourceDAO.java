package com.kolmakova.tattoosalon.dao.impl;

import com.kolmakova.tattoosalon.dao.AbstractDAO;
import com.kolmakova.tattoosalon.dao.Query;
import com.kolmakova.tattoosalon.entity.impl.Resource;
import org.springframework.stereotype.Component;

@Component
public class ResourceDAO extends AbstractDAO<Resource> {
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
