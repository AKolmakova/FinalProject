package com.kolmakova.TattooSalonProject.dao.impl;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.dao.Query;
import com.kolmakova.TattooSalonProject.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl extends AbstractDAO<User> {
    private static final String TABLE_NAME = "user";

    @Override
    protected Query getSaveQuery(User user) {
        return null;
    }

    @Override
    protected Query getUpdateQuery(User user) {
        return null;
    }

    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }
}
