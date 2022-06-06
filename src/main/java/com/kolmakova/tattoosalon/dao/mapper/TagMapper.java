package com.kolmakova.tattoosalon.dao.mapper;

import com.kolmakova.tattoosalon.entity.impl.Tag;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TagMapper implements RowMapper<Tag> {
    @Override
    public Tag mapRow(ResultSet resultSet, int i) throws SQLException {
        Tag tag = new Tag();
        tag.setId(resultSet.getInt("id"));
        tag.setName(resultSet.getString("s_name"));

        return tag;
    }
}
