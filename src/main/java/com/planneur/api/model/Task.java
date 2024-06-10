package com.planneur.api.model;

public class Task {


    private int id;
    private String name;
    private String description;
    private int position;
    private int categoryId;

    // Constructor
    public Task(int id, String name, String description, int position, int categoryId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.position = position;
        this.categoryId = categoryId;
    }

    // Getters & Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
