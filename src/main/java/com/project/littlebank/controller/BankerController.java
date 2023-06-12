package com.project.littlebank.controller;


import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.entity.Banker;
import com.project.littlebank.service.BankerService;
import com.project.littlebank.service.BankerServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.HttpRequestHandlerServlet;

@Controller
@RequestMapping("/banker")
@RequiredArgsConstructor
public class BankerController {

    private final BankerService bankerService;

    @GetMapping("/login")
    public String bankerLoginPage(){
        return "bankerLoginForm";
    }

    @PostMapping("/login")
    public String bankerLogin(BankerDTO bankerDTO, HttpSession session){
        boolean loginResult = bankerService.login(bankerDTO);

        if(loginResult){
            session.setAttribute("loginId", bankerDTO.getId());
            return "redirect:/banker/profile";
        }
        return "bankerLoginFail";
    }

    @GetMapping("/profile")
    public String bankerProfile(HttpSession session){
        if(session.getAttribute("loginId") == null){
            return "noAuthority";
        }
        return "bankerProfile";
    }

    @GetMapping("/logout")
    public String bankerLogout(HttpServletRequest request){
        HttpSession isLogin = request.getSession(false);
        if(isLogin != null){
            isLogin.invalidate();
        }
        return "redirect:/banker/login";
    }

    @GetMapping("/profile/update")
    public String bankerUpdatePage(HttpServletRequest request, HttpSession session, Model model){
        HttpSession isLogin = request.getSession(false);
        if(isLogin == null){
            return "noAuthority";

        }
        Banker banker = bankerService.bankerProfile((String)session.getAttribute("loginId"));
        model.addAttribute("banker", banker);
        return "bankerUpdate";
    }

    @PostMapping("/profile/update")
    public String bankerUpdate(HttpSession session, BankerDTO bankerDTO){
        bankerService.bankerUpdate((String)session.getAttribute("loginId"), bankerDTO);
        return "redirect:/banker/profile";
    }

}
