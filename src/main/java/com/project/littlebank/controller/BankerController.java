package com.project.littlebank.controller;


import com.project.littlebank.entity.Banker;
import com.project.littlebank.service.BankerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequiredArgsConstructor
public class BankerController {

    private final BankerService bankerService;

    @GetMapping("/banker/login")
    public ModelAndView bankerLoginPage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("bankerLoginForm");
        return modelAndView;
    }

    @PostMapping("/banker/login")
    public ModelAndView bankerLogin(@ModelAttribute Banker banker){
        Banker loginResult = bankerService.bankerLogin(banker);
        ModelAndView modelAndView = new ModelAndView();
        if(loginResult != null){
            modelAndView.setViewName("bankerLoginSuccess");
        }
        else {
            modelAndView.setViewName("bankerLoginFail");
        }
        return modelAndView;
    }

}
