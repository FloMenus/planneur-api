package com.planneur.api.model;

public class Category {

    private int id;
    private String name;
    private String background_color;
    private int position;
    private int projectId;

    // Constructor
    public Category(int id, String name, String background_color, int position, int projectId) {
        this.id = id;
        this.name = name;
        this.background_color = background_color;
        this.position = position;
        this.projectId = projectId;
    }

    //Getters & Setters
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

    public String getBackground_color() {
        return background_color;
    }

    public void setBackground_color(String background_color) {
        this.background_color = background_color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }
}
