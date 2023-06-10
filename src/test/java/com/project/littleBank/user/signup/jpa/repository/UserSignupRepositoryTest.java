package com.project.littleBank.user.signup.jpa.repository;

import com.project.littleBank.user.signup.jpa.entity.TestBankerUser;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;


@SpringBootTest
@Transactional
class UserSignupRepositoryTest {

    @Autowired
    UserSignupRepository userSignupRepository;

    @Test
    public void db에서Id검색() {

        String id = "test";
        String use = "Y";

        Optional<TestBankerUser> byCusIdAndUseYn = userSignupRepository.findByCusIdAndUseYn(id, use);
        if(byCusIdAndUseYn.isPresent()){
            TestBankerUser testBankerUser = byCusIdAndUseYn.get();
            System.out.println(testBankerUser.getCusId());
            System.out.println("사용할 수 없는 아이디입니다");
        }else{
            System.out.println("존재하지 않는 아이디입니다");
        }
    }



}