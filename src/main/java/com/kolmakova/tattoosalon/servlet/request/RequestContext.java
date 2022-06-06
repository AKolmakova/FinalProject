package com.kolmakova.tattoosalon.servlet.request;

import java.util.HashMap;
import java.util.Map;

public class RequestContext {
    private final Map<String, Object> variables;

    public RequestContext() {
        this.variables = new HashMap<>();
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public RequestContext variable(String key, Object value) {
        this.variables.put(key, value);
        return this;
    }
}
