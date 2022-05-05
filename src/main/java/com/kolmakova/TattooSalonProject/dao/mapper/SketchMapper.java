package com.kolmakova.TattooSalonProject.dao.mapper;

import com.kolmakova.TattooSalonProject.entity.Sketch;
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
        sketch.setGrade(resultSet.getInt("grade"));
        sketch.setApproved(resultSet.getBoolean("s_approved"));
        sketch.setColor(resultSet.getString("color"));
        sketch.setSize(resultSet.getInt("size"));
        sketch.setPrice(resultSet.getDouble("price"));

        return sketch;
    }
}
