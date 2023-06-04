package com.project.littlebank.repository;

import com.project.littlebank.entity.Banker;

import java.util.Optional;

public interface BankerRepository {

    Optional<Banker> findByB_id(String b_id);
    Banker findByB_pwd(String b_pwd);
}
