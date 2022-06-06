package com.kolmakova.tattoosalon.dao.impl;

import com.kolmakova.tattoosalon.dao.AbstractDAO;
import com.kolmakova.tattoosalon.dao.Query;
import com.kolmakova.tattoosalon.entity.impl.Sketch;
import org.springframework.stereotype.Component;

@Component
public class SketchDAO extends AbstractDAO<Sketch> {
    private static final String TABLE_NAME = "sketch";

    @Override
    protected Query getSaveQuery(Sketch sketch) {
        return null;
    }

    @Override
    protected Query getUpdateQuery(Sketch sketch) {
        return null;
    }

    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }
}
