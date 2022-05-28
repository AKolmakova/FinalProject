package com.kolmakova.TattooSalonProject.dao.mapper;

import com.kolmakova.TattooSalonProject.entity.Booking;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class BookingMapper implements RowMapper<Booking> {
    @Override
    public Booking mapRow(ResultSet resultSet, int i) throws SQLException {
        Booking booking = new Booking();
        booking.setId(resultSet.getInt("id"));
        booking.setGrade(resultSet.getInt("grade"));
        booking.setDiscount(resultSet.getInt("discount"));
        booking.setStatus(resultSet.getString("status"));

        return booking;
    }
}
