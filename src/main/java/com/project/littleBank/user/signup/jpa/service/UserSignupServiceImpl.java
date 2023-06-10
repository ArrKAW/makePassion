
package com.project.littleBank.user.signup.jpa.service;


import com.project.littleBank.user.signup.jpa.dto.CustomerRequestDTO;

import com.project.littleBank.user.signup.jpa.entity.TestBankerUser;
import com.project.littleBank.user.signup.jpa.repository.UserSignupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class UserSignupServiceImpl implements UserSignupService {


    private final UserSignupRepository userSignupRepository;

    @Override
    public void SaveTestBankerUser(CustomerRequestDTO customerRequestDTO) {



        TestBankerUser SaveTestBankerUserObj = new TestBankerUser(customerRequestDTO);
        userSignupRepository.save(SaveTestBankerUserObj);
    }
/*
    @Override
    public String findCusIdAndUseYn(String cusId, String useYn) {
        Optional<TestBankerUser> byCusIdAndUseYn = userSignupRepository.findByCusIdAndUseYn(cusId, useYn);
        TestBankerUser testBankerUser = byCusIdAndUseYn.orElseThrow(EntityNotFoundException::new);

        return testBankerUser.getCusId();
    }*/

    @Override
    public String idCheck(String customerId){

        Optional<TestBankerUser> optionalTestBankerUser = userSignupRepository.findByCusIdAndUseYn(customerId, "Y");
        if (optionalTestBankerUser.isPresent()){
            return "no";
        }else{
           return "ok";
        }
    }

}
