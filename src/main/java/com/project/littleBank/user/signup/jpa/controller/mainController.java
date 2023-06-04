package com.project.littlebank.user.signup.jpa.controller;

import com.project.littlebank.user.signup.jpa.dto.UserRequestDTO;
import com.project.littlebank.user.signup.jpa.service.UserSignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
    public String SaveTestBankerUser(UserRequestDTO userRequestDTO){
        userSignupService.saveTestBankerUser(userRequestDTO);
        return "main";
    }

}
