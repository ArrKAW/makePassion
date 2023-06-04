
package com.project.littlebank.user.signup.jpa.service;


import com.project.littlebank.user.signup.jpa.dto.UserRequestDTO;
import com.project.littlebank.user.signup.jpa.entity.TestBankerUser;
import com.project.littlebank.user.signup.jpa.repository.UserSignupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@RequiredArgsConstructor
@Transactional
public class UserSignupServiceImpl implements UserSignupService {


    private final UserSignupRepository userSignupRepository;

    @Override
    public void saveTestBankerUser(UserRequestDTO userRequestDTO) {
        TestBankerUser saveTestBankerUserObj = new TestBankerUser(userRequestDTO);
        userSignupRepository.save(saveTestBankerUserObj);
    }
}
