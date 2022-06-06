package com.kolmakova.tattoosalon.dao.mapper;

import com.kolmakova.tattoosalon.entity.impl.Account;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class AccountMapper implements RowMapper<Account> {
    @Override
    public Account mapRow(ResultSet resultSet, int i) throws SQLException {
        Account account = new Account();
        account.setId(resultSet.getInt("id"));
        account.setLogin(resultSet.getString("s_login"));
        account.setPassword(resultSet.getString("s_password"));
        account.setEmail(resultSet.getString("s_email"));
        account.setRole(resultSet.getString("s_role"));

        return account;
    }
}
