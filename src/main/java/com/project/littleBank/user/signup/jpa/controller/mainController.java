package com.project.littleBank.user.signup.jpa.controller;

import com.project.littleBank.user.signup.jpa.dto.CustomerRequestDTO;
import com.project.littleBank.user.signup.jpa.service.UserSignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @PostMapping("/signup/save")
    public String SaveTestBankerUser(CustomerRequestDTO customerRequestDTO){

        userSignupService.SaveTestBankerUser(customerRequestDTO);
        return "main";
    }

    //아이디 중복확인
    @PostMapping("/signup/idCheck")
    public @ResponseBody String idCheck(@RequestParam String customerId){
        String checkResult = userSignupService.idCheck(customerId);
        return checkResult;
    }

}
