package com.kolmakova.tattoosalon.dao;

public class Query {
    private int id;
    private String customQuery;
    private Object[] args;

    private Query() {

    }

    public static QueryBuilder builder() {
        return new Query().new QueryBuilder();
    }

    public String getCustomQuery() {
        return customQuery;
    }

    public Object[] getArgs() {
        return args;
    }

    public int getId() {
        return id;
    }

    public class QueryBuilder {
        private QueryBuilder() {

        }

        public QueryBuilder id(int id) {
            Query.this.id = id;
            return this;
        }

        public QueryBuilder query(String customQuery) {
            Query.this.customQuery = customQuery;
            return this;
        }

        public QueryBuilder args(Object... args) {
            Query.this.args = args;
            return this;
        }

        public Query build() {
            return Query.this;
        }
    }

}
