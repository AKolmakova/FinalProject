package com.kolmakova.TattooSalonProject.dao.impl;

import com.kolmakova.TattooSalonProject.dao.AbstractDAO;
import com.kolmakova.TattooSalonProject.dao.Query;
import com.kolmakova.TattooSalonProject.entity.Customer;
import org.springframework.stereotype.Component;

@Component
public class CustomerDAOImpl extends AbstractDAO<Customer> {
    private static final String TABLE_NAME = "customer";

    @Override
    protected Query getSaveQuery(Customer customer) {
        return Query.builder()
                .args(customer.getId(), customer.getName(), customer.getSurname())
                .build();
    }

    @Override
    protected Query getUpdateQuery(Customer customer) {
        return Query.builder()
                .id(customer.getId())
                .query("name=? , surname=?")
                .args(customer.getName(), customer.getSurname())
                .build();
    }

    @Override
    protected String getTableName() {
        return TABLE_NAME;
    }

}
