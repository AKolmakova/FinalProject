package com.kolmakova.tattoosalon.dao.mapper;

import com.kolmakova.tattoosalon.entity.impl.Sketch;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class SketchMapper implements RowMapper<Sketch> {
    @Override
    public Sketch mapRow(ResultSet resultSet, int i) throws SQLException {
        Sketch sketch = new Sketch();
        sketch.setId(resultSet.getInt("id"));
        sketch.setGrade(resultSet.getInt("s_grade"));
        sketch.setApproved(resultSet.getBoolean("s_approved"));
        sketch.setColor(resultSet.getString("s_color"));
        sketch.setSize(resultSet.getInt("s_size"));
        sketch.setPrice(resultSet.getDouble("s_price"));

        return sketch;
    }
}
