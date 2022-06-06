package com.kolmakova.tattoosalon.dao.mapper;

import com.kolmakova.tattoosalon.entity.impl.DynamicContent;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class DCMapper implements RowMapper<DynamicContent> {
    @Override
    public DynamicContent mapRow(ResultSet resultSet, int i) throws SQLException {
        DynamicContent dynamicContent = new DynamicContent();
        dynamicContent.setId(resultSet.getInt("id"));
        dynamicContent.setElementType(resultSet.getString("s_element_type"));
        dynamicContent.setLocation(resultSet.getString("s_location"));

        return dynamicContent;
    }
}
