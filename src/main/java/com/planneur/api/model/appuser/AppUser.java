package com.planneur.api.model.appuser;

import com.planneur.api.model.Category;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String email;
    private String password;
    private Boolean isLogged;

    @OneToMany
    private List<Category> categories= new ArrayList<Category>();

    // Constructor
    public AppUser(Integer id, String name, String email, String password, Boolean isLogged) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isLogged = isLogged;
    }

    public AppUser() {
    }

    // Getter & Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void setLogged(Boolean logged) {
        isLogged = logged;
    }

    public Boolean getLogged() {
        return isLogged;
    }
}
