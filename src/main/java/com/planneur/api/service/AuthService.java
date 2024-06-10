package com.planneur.api.service;

import com.planneur.api.model.AppUser;
import com.planneur.api.repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {

    @Autowired
    private final AuthRepository authRepository;

    public AuthService(AuthRepository authRepository) {
        this.authRepository = authRepository;
    }

//    public record AppUserSignupRequest(
//        String name,
//        String email,
//        String password
//    ) {
//
//    }

    public void signup(AppUser request) {
        authRepository.save(request);
    }
}
