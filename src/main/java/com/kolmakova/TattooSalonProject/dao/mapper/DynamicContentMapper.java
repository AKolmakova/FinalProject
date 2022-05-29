package com.kolmakova.TattooSalonProject.dao.mapper;

import com.kolmakova.TattooSalonProject.entity.DynamicContent;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DynamicContentMapper implements RowMapper<DynamicContent> {
    @Override
    public DynamicContent mapRow(ResultSet resultSet, int i) throws SQLException {
        DynamicContent dynamicContent = new DynamicContent();
        dynamicContent.setId(resultSet.getInt("id"));
        dynamicContent.setElementType(resultSet.getString("element_type"));
        dynamicContent.setLocation(resultSet.getString("location"));

        return dynamicContent;
    }
}
