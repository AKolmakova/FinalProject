package com.kolmakova.TattooSalonProject.dao.mapper;

import com.kolmakova.TattooSalonProject.entity.Theme;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ThemeMapper implements RowMapper<Theme> {
    @Override
    public Theme mapRow(ResultSet resultSet, int i) throws SQLException {
        Theme theme = new Theme();
        theme.setId(resultSet.getInt("id"));
        theme.setName(resultSet.getString("name"));
        theme.setType(resultSet.getString("type"));

        return theme;
    }
}
