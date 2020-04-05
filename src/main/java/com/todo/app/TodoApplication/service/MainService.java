package com.todo.app.TodoApplication.service;

import com.todo.app.TodoApplication.validators.Validator;
import jdk.jfr.Frequency;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Service
public class MainService implements DomainService{

    private FirestoreService firestoreService;
    private Validator validator;

    private final String TODO_COLLECTION_NAME = "todo";

    public MainService(FirestoreService firestoreService, Validator validator) {
        this.firestoreService = firestoreService;
        this.validator = validator;
    }

    @Override
    public void create(Map<String, Object> request) throws ExecutionException, InterruptedException {
        String id = validator.validateAndGetIdFromRequest(request);
        firestoreService.createDocument(TODO_COLLECTION_NAME, id, request);
    }

    @Override
    public List<Map<String, Object>> findAll() throws ExecutionException, InterruptedException {
        return firestoreService.getAllDocumentsFromCollection(TODO_COLLECTION_NAME);
    }

    @Override
    public void update(Map<String, Object> request) throws IllegalArgumentException, NullPointerException, ExecutionException, InterruptedException {
        String id = validator.validateAndGetIdFromRequest(request);

        firestoreService.updateDocument(TODO_COLLECTION_NAME, id, request);
    }

    @Override
    public void delete(String id) throws ExecutionException, InterruptedException {
        firestoreService.deleteDocument(TODO_COLLECTION_NAME, id);
    }

    @Override
    public void deleteFields(Map<String, Object> request) throws ExecutionException, InterruptedException {
        String id = validator.validateAndGetIdFromRequest(request);

        firestoreService.deleteFields(TODO_COLLECTION_NAME, id, (List<String>) request);
    }

}
