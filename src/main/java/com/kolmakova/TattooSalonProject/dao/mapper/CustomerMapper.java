package com.kolmakova.TattooSalonProject.dao.mapper;

import com.kolmakova.TattooSalonProject.entity.Customer;
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
        customer.setName(resultSet.getString("name"));
        customer.setSurname(resultSet.getString("surname"));
        customer.setPhone(resultSet.getString("phone"));
        customer.setRating(resultSet.getInt("rating"));

        return customer;
    }
}
