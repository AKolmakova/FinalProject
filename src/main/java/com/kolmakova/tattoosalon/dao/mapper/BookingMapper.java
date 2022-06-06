package com.kolmakova.tattoosalon.dao.mapper;

import com.kolmakova.tattoosalon.entity.impl.Booking;
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
        booking.setGrade(resultSet.getInt("s_grade"));
        booking.setDiscount(resultSet.getInt("s_discount"));
        booking.setStatus(resultSet.getString("s_status"));

        return booking;
    }
}
