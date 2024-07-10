package com.planneur.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String backgroundColor;
    private Integer position;
    private Integer appUserId;

    // Constructor
    public Category(String name, String backgroundColor, Integer position, Integer appUserId) {
        this.name = name;
        this.backgroundColor = backgroundColor;
        this.position = position;
        this.appUserId = appUserId;
    }

    public Category() {
    }

    //Getters & Setters
    public Integer getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackground_color(String background_color) {
        this.backgroundColor = background_color;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public Integer getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(Integer appUserId) {
        this.appUserId = appUserId;
    }
}
