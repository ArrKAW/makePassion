package com.project.littleBank.user.signup.jpa.controller;

import com.project.littleBank.user.signup.jpa.entity.TestBankerUser;
import com.project.littleBank.user.signup.jpa.service.UserSignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigInteger;

@Controller
@RequiredArgsConstructor
public class mainController {

    private final UserSignupService userSignupService;

    @GetMapping("/")
    public String main(){
        return "main";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

    @PostMapping("/signup.do")
    public String SaveTestBankerUser(TestBankerUser testBankerUser){

        userSignupService.SaveTestBankerUser(testBankerUser);
        return "main";
    }

}
