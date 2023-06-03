package com.project.littlebank.domain.member.service;


import com.project.littleBank.dto.MemberDTO;
import com.project.littleBank.entity.MemberEntity;
import com.project.littleBank.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void save(MemberDTO memberDTO){
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);
        memberRepository.save(memberEntity);
    }

    public MemberDTO login(MemberDTO memberDTO) {
        Optional<MemberEntity> byMemberId = memberRepository.findByMemberId(memberDTO.getMemberId());
        if (byMemberId.isPresent()) {
            //해당 아이디 가진 회원정보가 있다
            MemberEntity memberEntity = byMemberId.get();
            if (memberEntity.getMemberPassword().equals(memberDTO.getMemberPassword())) {
                //비밀번호 일치
                //entity -> dto 변환 후 리턴
                MemberDTO dto = MemberDTO.memberDTO(memberEntity);
                return dto;
            } else {
                //비밀번호 불일치
                return null;
            }
        } else {
            //해당 아이디 없음
            return null;

        }
    }
    public MemberDTO updateForm(String myId) {
        Optional<MemberEntity> optionalMemberEntity = memberRepository.findByMemberId(myId);
        if (optionalMemberEntity.isPresent()) {
            return MemberDTO.memberDTO(optionalMemberEntity.get());
        } else {
            return null;
        }
    }

    public void update(MemberDTO memberDTO) {
        memberRepository.save(MemberEntity.toUpdateMemberEntity(memberDTO));
    }
}
