package com.project.littlebank.user.signup.jpa.controller;

import com.project.littlebank.user.signup.jpa.dto.CustomerRequestDTO;
import com.project.littlebank.user.signup.jpa.service.UserSignupService;

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
    public String saveTestBankerUser(CustomerRequestDTO customerRequestDTO) {

        userSignupService.saveTestBankerUser(customerRequestDTO);
        return "redirect:/";
    }

    //아이디 중복확인
    @PostMapping("/signup/idCheck")
    public @ResponseBody String idCheck(@RequestParam String customerId){
        String idCheckResult = userSignupService.idCheck(customerId);
        return idCheckResult;
    }

    //회원 탈퇴
    @GetMapping("/signout")
    public String signout() {
        return "signout";
    }

    @ResponseBody
    @PostMapping("/signout/signoutCheck")
    public String signoutTestBankerUser(@RequestParam String customerId) {
        String signoutResult = userSignupService.signoutTestBankerUser(customerId);
        return signoutResult;
    }

}
