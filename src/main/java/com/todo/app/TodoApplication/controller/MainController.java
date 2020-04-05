package com.todo.app.TodoApplication.controller;

import com.todo.app.TodoApplication.service.MainService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ExecutionException;

@RestController
public class MainController {

    private MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/")
    public ResponseEntity findAll() throws ExecutionException, InterruptedException {
        return ResponseEntity.ok(mainService.findAll());
    }

    @PostMapping("/")
    public ResponseEntity create(@RequestBody Map<String, Object> request)
            throws ExecutionException, InterruptedException {
        mainService.create(request);
        return ResponseEntity.ok().build();
    }
}
