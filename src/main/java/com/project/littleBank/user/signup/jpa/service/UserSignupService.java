package com.project.littleBank.user.signup.jpa.service;

import com.project.littleBank.user.signup.jpa.dto.CustomerRequestDTO;


public interface UserSignupService {

    void SaveTestBankerUser(CustomerRequestDTO customerRequestDTO);

    String idCheck(String customerId);
}

