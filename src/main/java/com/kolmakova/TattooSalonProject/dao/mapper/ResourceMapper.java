package com.kolmakova.TattooSalonProject.dao.mapper;

import com.kolmakova.TattooSalonProject.entity.Resource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class ResourceMapper implements RowMapper<Resource> {
    @Override
    public Resource mapRow(ResultSet resultSet, int i) throws SQLException {
        Resource resource = new Resource();
        resource.setId(resultSet.getInt("id"));
        resource.setUrl(resultSet.getString("url"));

        return resource;
    }
}