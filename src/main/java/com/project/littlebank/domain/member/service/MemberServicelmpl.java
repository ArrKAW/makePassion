package com.project.littlebank.domain.member.service;


import com.project.littlebank.domain.member.dto.MemberDTO;
import com.project.littlebank.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServicelmpl /*implements MemberService*/{

    private final MemberRepository memberRepository;

    public MemberDTO getMember(MemberDTO memberDTO) throws Exception{
        return memberRepository.getMember(memberDTO);
    }





/*
    @Override
    public String login(String userId, String userPassword){
        return memberRepository.login(userId, userPassword);
    }

 */
    // public boolean login1(MemberDTO memberDTO) {
    //    MemberDTO loginMember = memberRepository.login1(memberDTO);
    //    if (loginMember != null) {
    //        return true;
    //    } else {
    //       return false;
    // }
    //}
}
