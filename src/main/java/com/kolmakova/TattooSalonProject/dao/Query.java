package com.kolmakova.TattooSalonProject.dao;

public class Query {
    private int id;
    private String query;
    private Object[] args;

    private Query() {

    }

    public String getQuery() {
        return query;
    }

    public Object[] getArgs() {
        return args;
    }

    public int getId() {
        return id;
    }

    public static QueryBuilder builder() {
        return new Query().new QueryBuilder();
    }

    public class QueryBuilder {
        private QueryBuilder() {

        }

        public QueryBuilder id(int id) {
            Query.this.id = id;
            return this;
        }

        public QueryBuilder query(String query) {
            Query.this.query = query;
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
