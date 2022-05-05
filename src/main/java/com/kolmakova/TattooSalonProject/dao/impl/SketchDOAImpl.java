package com.kolmakova.TattooSalonProject.dao.impl;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.dao.Query;
import com.kolmakova.TattooSalonProject.entity.Sketch;
import org.springframework.stereotype.Component;

@Component
public class SketchDOAImpl extends AbstractDAO<Sketch> {
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
