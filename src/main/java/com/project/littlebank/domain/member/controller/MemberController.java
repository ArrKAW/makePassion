package com.project.littlebank.domain.member.controller;

import com.project.littlebank.domain.member.dto.MemberDTO;
import com.project.littlebank.domain.member.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;

    @GetMapping("member/login")
    public void getSelectOne() throws Exception{}

    @PostMapping("member/login")
    public String getSelectOne(MemberDTO memberDTO, HttpSession session) throws Exception{
        memberDTO = memberService.getSelectOne(memberDTO);
        if(memberDTO != null) {
            session.setAttribute("main", memberDTO);
        }
        return "redirect:../member/home";
    }
}
