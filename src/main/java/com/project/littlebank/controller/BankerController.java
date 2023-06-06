package com.project.littlebank.controller;


import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.service.BankerService;
import com.project.littlebank.service.BankerServiceImpl;
import jakarta.servlet.http.HttpSession;
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
    public String bankerLogin(BankerDTO bankerDTO, HttpSession session){
        boolean loginResult = bankerService.login(bankerDTO);

        if(loginResult){
            session.setAttribute("loginId", bankerDTO.getBankerId());
            return "redirect:/banker/profile";
        }
        return "bankerLoginFail";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String bankerProfile(HttpSession session){
        if(session.getAttribute("loginId") == null){
            return "noAuthority";
        }
        return "bankerProfile";
    }

}
