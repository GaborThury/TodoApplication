package com.todo.app.TodoApplication.domain;

public class Todo {

    private long id;
    private String title;
    private String description;
    private String category;
    private boolean isDone;

    public Todo(long id, String title, String description, String category, boolean isDone) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.category = category;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }
}
