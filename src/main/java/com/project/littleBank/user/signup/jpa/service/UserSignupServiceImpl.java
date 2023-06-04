
package com.project.littleBank.user.signup.jpa.service;


import com.project.littleBank.user.signup.jpa.entity.TestBankerUser;
import com.project.littleBank.user.signup.jpa.repository.UserSignupRepository;
import com.project.littlebank.sample.jpa.entity.TestExample;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class UserSignupServiceImpl implements UserSignupService {


    private final UserSignupRepository userSignupRepository;

    @Override
    public void SaveTestBankerUser(TestBankerUser testBankerUser) {

        TestBankerUser SaveTestBankerUserObj = new TestBankerUser();
        SaveTestBankerUserObj.setCUS_NAME(testBankerUser.getCUS_NAME());
        SaveTestBankerUserObj.setCUS_ID(testBankerUser.getCUS_ID());
        SaveTestBankerUserObj.setCUS_PASSWORD(testBankerUser.getCUS_PASSWORD());
        SaveTestBankerUserObj.setCUS_ADDR1(testBankerUser.getCUS_ADDR1());
        SaveTestBankerUserObj.setCUS_ADDR2(testBankerUser.getCUS_ADDR2());
        SaveTestBankerUserObj.setCUS_TEL(testBankerUser.getCUS_TEL());
        SaveTestBankerUserObj.setCUS_PHONE(testBankerUser.getCUS_PHONE());
        userSignupRepository.save(SaveTestBankerUserObj);
    }
    /*
    testBankerUser.getCUS_NUM(), testBankerUser.getCUS_NAME(), testBankerUser.getCUS_GRADE(), testBankerUser.getCUS_ID(), testBankerUser.getCUS_PASSWORD(), testBankerUser.getCUS_ADDR1(), testBankerUser.getCUS_ADDR2(), testBankerUser.getCUS_TEL(), testBankerUser.getCUS_PHONE(), testBankerUser.getUSE_YN()
     */
}
