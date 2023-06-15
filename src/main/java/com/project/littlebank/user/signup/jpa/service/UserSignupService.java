package com.project.littlebank.user.signup.jpa.service;

import com.project.littlebank.user.signup.jpa.dto.CustomerRequestDTO;


public interface UserSignupService {

    void saveTestBankerUser(CustomerRequestDTO customerRequestDTO);

    String idCheck(String customerId);

    String signoutTestBankerUser(String customerId);
}

