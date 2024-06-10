package com.planneur.api.controller;

import com.planneur.api.model.AppUser;
import com.planneur.api.model.mapping.appUser.AppUserLoginDTO;
import com.planneur.api.model.mapping.appUser.AppUserSignupDTO;


import com.planneur.api.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;


    @RequestMapping(method = RequestMethod.POST, value = "/auth/signup")
        public void authSignup(@RequestBody AppUser user) {
        authService.signup(user);
    }
}
