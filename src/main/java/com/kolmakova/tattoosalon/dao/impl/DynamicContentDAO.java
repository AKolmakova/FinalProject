package com.kolmakova.tattoosalon.dao.impl;

import com.kolmakova.tattoosalon.dao.AbstractDAO;
import com.kolmakova.tattoosalon.dao.Query;
import com.kolmakova.tattoosalon.entity.impl.DynamicContent;
import com.kolmakova.tattoosalon.entity.type.DCElementType;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DynamicContentDAO extends AbstractDAO<DynamicContent> {
    private static final String TABLE_NAME = "dynamic_content";

    public List<DynamicContent> getBannerContent() {
        Query query = Query.builder()
                .query("SELECT * FROM " + TABLE_NAME + " WHERE s_element_type LIKE '" + DCElementType.BANNER + "'")
                .build();
        return super.findAll(query);
    }

    public List<DynamicContent> getAdvertisingContent() {
        Query query = Query.builder()
                .query("SELECT * FROM " + TABLE_NAME + " WHERE s_element_type LIKE '" + DCElementType.ADVERTISING + "'")
                .build();
        return super.findAll(query);
    }

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
