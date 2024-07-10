package com.planneur.api.service;

import com.planneur.api.exceptions.auth.AuthNotFoundException;
import com.planneur.api.exceptions.auth.AuthWrongPasswordException;
import com.planneur.api.feeder.InitialCategoriesFeeder;
import com.planneur.api.model.appuser.*;
import com.planneur.api.repository.AuthRepository;
import com.planneur.api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private final AuthRepository authRepository;
    private final CategoryRepository categoryRepository;
    private final AppUserDTOMapper appUserDTOMapper;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public AuthService(AuthRepository authRepository, CategoryRepository categoryRepository, AppUserDTOMapper appUserDTOMapper) {
        this.authRepository = authRepository;
        this.categoryRepository = categoryRepository;
        this.appUserDTOMapper = new AppUserDTOMapper();
        this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    }

    public void signup(AppUser appUserRequest) {
        appUserRequest.setLogged(false);
        appUserRequest.setPassword(bCryptPasswordEncoder.encode(appUserRequest.getPassword()));
        authRepository.save(appUserRequest);

        // Feeding the user categories with the initial categories
        AppUser appUserCreated = authRepository.findByEmail(appUserRequest.getEmail()).orElseThrow(AuthNotFoundException::new);
        categoryRepository.saveAll(InitialCategoriesFeeder.getInitialCategories(appUserCreated.getId()));
    }

    public AppUserDTO login(Credentials credentials) {
        AppUser appUser = authRepository.findByEmail(
                credentials.email()).orElseThrow(AuthNotFoundException::new);
        if (!bCryptPasswordEncoder.matches(credentials.password(), appUser.getPassword())) {
            throw new AuthWrongPasswordException();
        }
        appUser.setLogged(true);
        authRepository.save(appUser);
        return appUserDTOMapper.apply(appUser);
    }

    public void disconnect(
            IdAndEmail idAndEmail) {
        {
            AppUser appUser = authRepository.findById(idAndEmail.id()).orElseThrow(AuthNotFoundException::new);
            appUser.setLogged(false);
            authRepository.save(appUser);
        }
    }
}
