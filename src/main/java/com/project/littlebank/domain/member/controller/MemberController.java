package com.project.littlebank.domain.member.controller;

import com.project.littlebank.domain.member.dto.MemberDTO;
import com.project.littlebank.domain.member.service.MemberService;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MemberController {
    //생성자 주입
    private final MemberService memberService;

    //회원가입 페이지 출력 요청
    @GetMapping("/member/save")
    public String saveForm() {
        return "save";
    }

    @PostMapping("/member/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        System.out.println("MemberController.save");
        System.out.println("memberDTO = " + memberDTO);
        memberService.save(memberDTO);
        return "login";
    }

    @GetMapping("/member/login")
    public String loginForm() {
        return "login";
    }

    @PostMapping("/member/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
        MemberDTO loginResult  = memberService.login(memberDTO);
        if (loginResult != null) {
            //성공
            session.setAttribute("loginId",loginResult.getMemberId());
            return  "main";
        } else {
            //실패
            return "login";
        }
    }
    @GetMapping("/member/update")
    public String updateForm(HttpSession session, Model model) {
        String myId = (String) session.getAttribute("loginId");
        MemberDTO memberDTO = memberService.updateForm(myId);
        model.addAttribute("updateMember", memberDTO);
        return "update";
    }

    @PostMapping("/member/update")
    public String update(@ModelAttribute MemberDTO memberDTO) {
        memberService.update(memberDTO);
        //상세페이지로 이동
        return "redirect:/member/"+ memberDTO.getId();
    }


}
