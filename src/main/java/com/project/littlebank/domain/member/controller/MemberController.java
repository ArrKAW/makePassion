package com.project.littlebank.domain.member.controller;

import com.project.littlebank.domain.member.dto.MemberDTO;
import com.project.littlebank.domain.member.service.MemberServicelmpl;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    @Autowired
    private final MemberServicelmpl memberService;

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    @GetMapping("/login")
    public String loginForm() {

        return "login";
    }
    @PostMapping("/login")
    public String getMember(MemberDTO memberDTO, HttpSession session) throws Exception{
        memberDTO = memberService.getMember(memberDTO);
        if(memberDTO !=null) {
            session.setAttribute("userId",memberDTO);
        }
        return "redirect:../member/check";
    }
}
