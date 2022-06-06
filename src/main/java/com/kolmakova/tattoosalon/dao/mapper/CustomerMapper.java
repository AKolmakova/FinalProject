package com.kolmakova.tattoosalon.dao.mapper;

import com.kolmakova.tattoosalon.entity.impl.Customer;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class CustomerMapper implements RowMapper<Customer> {
    @Override
    public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
        Customer customer = new Customer();
        customer.setId(resultSet.getInt("id"));
        customer.setName(resultSet.getString("s_name"));
        customer.setSurname(resultSet.getString("s_surname"));
        customer.setPhone(resultSet.getString("s_phone"));
        customer.setRating(resultSet.getInt("s_rating"));

        return customer;
    }
}
