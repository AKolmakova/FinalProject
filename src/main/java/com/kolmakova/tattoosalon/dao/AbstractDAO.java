package com.kolmakova.tattoosalon.dao;

import com.kolmakova.tattoosalon.entity.Entity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public abstract class AbstractDAO<T extends Entity> {
    private static final Logger LOGGER = LogManager.getLogger();

    private static final String SELECT_ALL_QUERY = "SELECT * FROM ";
    private static final String GET_BY_ID_QUERY = "SELECT * FROM %s WHERE id=? ";
    private static final String SAVE_QUERY = "INSERT INTO %s VALUES";
    private static final String UPDATE_QUERY = "UPDATE %s SET %s WHERE id=%s ";
    private static final String DELETE_QUERY = "DELETE FROM %s WHERE id=? ";

    @Autowired
    private RowMapper<T> rowMapper;
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<T> findAll() {
        return jdbcTemplate.query(SELECT_ALL_QUERY + getTableName(), rowMapper);
    }

    public T getOne(int id) {
        return jdbcTemplate.queryForObject(String.format(GET_BY_ID_QUERY, getTableName()), rowMapper, id);
    }

    public void save(T t) {
        StringBuilder saveQueryBuilder = new StringBuilder(SAVE_QUERY);
        saveQueryBuilder.append("(");
        Query query = getSaveQuery(t);
        Object[] args = extractArgs(query);

        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                saveQueryBuilder.append("?");
                if (i < args.length - 1) {
                    saveQueryBuilder.append(",");
                }
            }
        }

        saveQueryBuilder.append(")");
        String saveQueryWithArgs = saveQueryBuilder.toString();
        jdbcTemplate.update(String.format(saveQueryWithArgs, getTableName()), args);
    }

    public void update(T t) {
        Query query = getUpdateQuery(t);
        if (query == null) {
            LOGGER.warn("Can not perform update operation because query is null");
            return;
        }

        Object[] args = extractArgs(query);
        jdbcTemplate.update(String.format(UPDATE_QUERY, getTableName(), query.getCustomQuery(), query.getId()), args);
    }

    public void delete(int id) {
        jdbcTemplate.update(String.format(DELETE_QUERY, getTableName()), id);
    }

    public List<T> findAll(Query query) {
        return jdbcTemplate.query(query.getCustomQuery(), query.getArgs(), rowMapper);
    }

    private Object[] extractArgs(Query query) {
        return (query != null) ? query.getArgs() : null;
    }

    protected abstract Query getSaveQuery(T t);

    protected abstract Query getUpdateQuery(T t);

    protected abstract String getTableName();

}
