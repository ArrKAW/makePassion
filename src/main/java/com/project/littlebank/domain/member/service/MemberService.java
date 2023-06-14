package com.project.littlebank.domain.member.service;

import com.project.littlebank.domain.member.dto.MemberDTO;
import com.project.littlebank.domain.member.repository.MemberRepository;

import javax.inject.Inject;

public interface MemberService {
    /*MemberDTO getMember(String userId, String userPassword);*/

    boolean login(MemberDTO memberDTO);
}
