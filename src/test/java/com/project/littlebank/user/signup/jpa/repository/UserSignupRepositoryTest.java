package com.project.littlebank.user.signup.jpa.repository;

import com.project.littlebank.user.signup.jpa.entity.TestBankerUser;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Transactional
class UserSignupRepositoryTest {

    @Autowired
    UserSignupRepository userSignupRepository;

    @Test
    public void 찾는거_테스트(){

        String id = "test";
        String use = "Y";

        TestBankerUser byCusIdAndUseYn = userSignupRepository.findByCusIdAndUseYn(id, use);
        System.out.println("byCusIdAndUseYn = " + byCusIdAndUseYn.getCusId());
    }


}