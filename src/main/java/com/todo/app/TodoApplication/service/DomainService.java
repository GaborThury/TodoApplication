package com.todo.app.TodoApplication.service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

public interface DomainService {

    void create(Map<String, Object> values) throws ExecutionException, InterruptedException;

    List<Map<String, Object>> findAll() throws ExecutionException, InterruptedException;

    void update(Map<String, Object> values) throws IllegalArgumentException, NullPointerException, ExecutionException, InterruptedException;

    void delete(String id) throws ExecutionException, InterruptedException;

    void deleteFields(Map<String, Object> request) throws ExecutionException, InterruptedException;
}
