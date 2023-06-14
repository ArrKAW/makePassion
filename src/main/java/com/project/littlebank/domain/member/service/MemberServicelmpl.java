package com.project.littlebank.domain.member.service;


import com.project.littlebank.domain.member.dto.MemberDTO;
import com.project.littlebank.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberServicelmpl implements MemberService {

    /* private final MemberRepository memberRepository;
     @Override
     public MemberDTO getMember(String userId, String userPassword){
         return memberRepository.login(userId, userPassword);*/
    private final MemberRepository memberRepository;


    @Override
    public boolean login(MemberDTO memberDTO) {
        MemberDTO findMember = memberRepository.findMember(memberDTO.getuserId(), memberDTO.getuserPassword());

        if(findMember ==null){
            return false;
        }
        return true;
    }
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

