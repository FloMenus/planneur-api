package com.planneur.api.controller;

import com.planneur.api.model.AppUser;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public String test() {
    AppUser testUser = new AppUser(123, "test@test.com", "Florent", "1234");
        return testUser.getName();
    }
}
