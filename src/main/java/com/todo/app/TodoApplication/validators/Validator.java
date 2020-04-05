package com.todo.app.TodoApplication.validators;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class Validator {

    public String validateAndGetIdFromRequest(Map<String, Object> request) {
        String id;
        try {
            id = request.remove("id").toString();
        } catch (NullPointerException e) {
            throw new NullPointerException("Attribute 'id' cannot be null!");
        }
        if (id.isBlank()) {
            throw new IllegalArgumentException("Attribute 'id' cannot be empty or blank!");
        }
        return id;
    }

}
