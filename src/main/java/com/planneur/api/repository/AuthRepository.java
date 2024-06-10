package com.planneur.api.repository;

import com.planneur.api.model.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthRepository extends JpaRepository<AppUser, Integer> {
}
