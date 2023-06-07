package com.project.littlebank.domain.member.service;


import com.project.littlebank.domain.member.dto.MemberDTO;
import com.project.littlebank.domain.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public MemberDTO getSelectOne(MemberDTO memberDTO) throws Exception{
        return memberRepository.getSelectOne(memberDTO);
    }
}
