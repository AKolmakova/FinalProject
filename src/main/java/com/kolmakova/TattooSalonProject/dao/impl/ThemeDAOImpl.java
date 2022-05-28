package com.kolmakova.TattooSalonProject.dao.impl;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.dao.Query;
import com.kolmakova.TattooSalonProject.entity.Tag;
import org.springframework.stereotype.Component;

@Component
public class ThemeDAOImpl extends AbstractDAO<Tag> {
    private static final String TABLE_NAME = "theme";

    @Override
    protected Query getSaveQuery(Tag theme) {
        return null;
    }

    @Override
    protected Query getUpdateQuery(Tag theme) {
        return null;
    }

    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }
}
