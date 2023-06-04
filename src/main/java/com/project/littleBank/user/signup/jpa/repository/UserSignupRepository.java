package com.project.littlebank.user.signup.jpa.repository;

import com.project.littlebank.user.signup.jpa.entity.TestBankerUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface UserSignupRepository extends JpaRepository<TestBankerUser, BigInteger> {

    TestBankerUser findByCusIdAndUseYn(String cusId, String useYn);

}
