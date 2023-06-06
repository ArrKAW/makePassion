package com.project.littlebank.controller;


import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.service.BankerService;
import com.project.littlebank.service.BankerServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/banker")
@RequiredArgsConstructor
public class BankerController {

    private final BankerService bankerService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String bankerLoginPage(){
        return "bankerLoginForm";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String bankerLogin(BankerDTO bankerDTO){
        boolean loginResult = bankerService.login(bankerDTO);

        if(loginResult){
            return "bankerLoginSuccess";
        }
        return "bankerLoginFail";
    }

}
