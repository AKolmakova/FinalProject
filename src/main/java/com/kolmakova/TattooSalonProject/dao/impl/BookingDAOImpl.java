package com.kolmakova.TattooSalonProject.dao.impl;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.dao.Query;
import com.kolmakova.TattooSalonProject.entity.Booking;
import org.springframework.stereotype.Component;

@Component
public class BookingDAOImpl extends AbstractDAO<Booking> {
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
