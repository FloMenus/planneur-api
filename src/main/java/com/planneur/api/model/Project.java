package com.planneur.api.model;

public class Project {

    private int id;
    private String name;
    private int userId;

    // Constructor
    public Project(int userId, String name, int id) {
        this.userId = userId;
        this.name = name;
        this.id = id;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
