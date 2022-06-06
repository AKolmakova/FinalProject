package com.kolmakova.tattoosalon.dao.impl;

import com.kolmakova.tattoosalon.dao.AbstractDAO;
import com.kolmakova.tattoosalon.dao.Query;
import com.kolmakova.tattoosalon.entity.impl.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingDAO extends AbstractDAO<Booking> {
    private static final String TABLE_NAME = "booking";

    @Override
    protected Query getSaveQuery(Booking booking) {
        return null;
    }

    @Override
    protected Query getUpdateQuery(Booking booking) {
        return null;
    }

    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }
}
