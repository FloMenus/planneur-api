package com.planneur.api.controller;

import com.planneur.api.model.appuser.AppUser;

import com.planneur.api.model.appuser.AppUserDTO;
import com.planneur.api.model.appuser.Credentials;
import com.planneur.api.model.appuser.IdAndEmail;
import com.planneur.api.service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @Autowired
    private AuthService authService;


    @RequestMapping(method = RequestMethod.POST, value = "/auth/signup")
    public void authSignup(@RequestBody AppUser user) {
        authService.signup(user);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/auth/login")
    public AppUserDTO authLogin(@RequestBody Credentials credentials) {
        return authService.login(credentials);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/auth/disconnect")
    public void authDisconnect(@RequestBody IdAndEmail idAndEmail) {
        authService.disconnect(idAndEmail);
    }

}
