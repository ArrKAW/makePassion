package com.project.littleBank.user.signup.jpa.repository;

import com.project.littleBank.user.signup.jpa.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSignupRepository extends JpaRepository<UserEntity, Long> {
}
