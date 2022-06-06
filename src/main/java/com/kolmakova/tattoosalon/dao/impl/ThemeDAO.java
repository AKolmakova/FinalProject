package com.kolmakova.tattoosalon.dao.impl;


import com.kolmakova.tattoosalon.dao.AbstractDAO;
import com.kolmakova.tattoosalon.dao.Query;
import com.kolmakova.tattoosalon.entity.impl.Tag;
import org.springframework.stereotype.Component;

@Component
public class ThemeDAO extends AbstractDAO<Tag> {
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
