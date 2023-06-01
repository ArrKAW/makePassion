package com.project.littleBank.user.signup.jpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @GetMapping("/")
    public String main(){
        return "main";
    }

    @GetMapping("/signup")
    public String signup(){
        return "signup";
    }

}
