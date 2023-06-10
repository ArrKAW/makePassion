
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

    @Override
    public String idCheck(String customerId){

        Optional<TestBankerUser> optionalTestBankerUser = userSignupRepository.findByCusIdAndUseYn(customerId, "Y");
        if (optionalTestBankerUser.isPresent()){
            return "no";
        }else{
            return "ok";
        }
    }

    @Override
    public String SignoutTestBankerUser(String customerId){
        Optional<TestBankerUser> optionalTestBankerUser = userSignupRepository.findByCusIdAndUseYn(customerId, "Y");
        if (optionalTestBankerUser.isPresent()){
            TestBankerUser testBankerUser = optionalTestBankerUser.get();
            testBankerUser.setUseYn("N");
            userSignupRepository.save(testBankerUser);
            return "success";
        }else{
            return "no_exist_id";
        }
    }

}
