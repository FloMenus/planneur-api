package com.planneur.api.controller;

import com.planneur.api.model.User;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test() {
    User testUser = new User("123", "test@test.com", "Florent", 123);
        return testUser.getName();
    }
}
