package com.kolmakova.tattoosalon.dao.impl;

import com.kolmakova.tattoosalon.dao.AbstractDAO;
import com.kolmakova.tattoosalon.dao.Query;
import com.kolmakova.tattoosalon.entity.impl.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO extends AbstractDAO<Account> {
    private static final String TABLE_NAME = "account";

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
