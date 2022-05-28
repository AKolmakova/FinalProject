package com.kolmakova.TattooSalonProject.dao.impl;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.dao.Query;
import com.kolmakova.TattooSalonProject.entity.Account;
import org.springframework.stereotype.Component;

@Component
public class UserDAOImpl extends AbstractDAO<Account> {
    private static final String TABLE_NAME = "user";

    @Override
    protected Query getSaveQuery(Account user) {
        return null;
    }

    @Override
    protected Query getUpdateQuery(Account user) {
        return null;
    }

    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }
}
