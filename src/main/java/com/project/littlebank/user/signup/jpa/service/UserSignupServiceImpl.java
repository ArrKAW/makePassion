
package com.project.littlebank.user.signup.jpa.service;


import com.project.littlebank.user.signup.jpa.dto.CustomerRequestDTO;
import com.project.littlebank.user.signup.jpa.entity.TestBankerUser;
import com.project.littlebank.user.signup.jpa.repository.UserSignupRepository;

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
    public void saveTestBankerUser(CustomerRequestDTO customerRequestDTO) {

        String idCheckResult = idCheck(customerRequestDTO.getCustomerId());
        if("ok".equals(idCheckResult)) {
            TestBankerUser saveTestBankerUserObj = new TestBankerUser(customerRequestDTO);
            userSignupRepository.save(saveTestBankerUserObj);
        }else{
            String errorMessage = "사용중인 아이디입니다. 다른 아이디를 입력해주세요.";
            String script = String.format("alert('%s');", errorMessage);
            String ajaxResponse = String.format("showErrorMessage('%s');", errorMessage);
        }
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
    public String signoutTestBankerUser(String customerId){
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
