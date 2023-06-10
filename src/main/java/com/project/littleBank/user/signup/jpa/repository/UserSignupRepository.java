package com.project.littleBank.user.signup.jpa.repository;

import com.project.littleBank.user.signup.jpa.entity.TestBankerUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Optional;

public interface UserSignupRepository extends JpaRepository<TestBankerUser, BigInteger> {


    //db에서 사용중인 아이디 검색
    Optional<TestBankerUser> findByCusIdAndUseYn(String cusId, String useYn);


}
