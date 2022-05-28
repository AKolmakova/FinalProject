package com.kolmakova.TattooSalonProject.dao.mapper;

import com.kolmakova.TattooSalonProject.entity.Tag;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ThemeMapper implements RowMapper<Tag> {
    @Override
    public Tag mapRow(ResultSet resultSet, int i) throws SQLException {
        Tag theme = new Tag();
        theme.setId(resultSet.getInt("id"));
        theme.setName(resultSet.getString("name"));

        return theme;
    }
}
