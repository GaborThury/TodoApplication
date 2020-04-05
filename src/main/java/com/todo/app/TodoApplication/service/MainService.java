package com.todo.app.TodoApplication.service;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

@Service
public class MainService {

    private FirestoreService firestoreService;

    public MainService(FirestoreService firestoreService) {
        this.firestoreService = firestoreService;
    }

    public void create(Map<String, Object> values) throws ExecutionException, InterruptedException {
        firestoreService.createDocument("testCollection", new HashMap<>(Collections.singletonMap("cica", "meow")));
    }

}
