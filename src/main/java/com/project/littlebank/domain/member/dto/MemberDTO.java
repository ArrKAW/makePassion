package com.project.littlebank.domain.member.dto;

import com.project.littlebank.domain.member.entity.MemberEntity;
import lombok.*;

@Data
public class MemberDTO {
    private Long id;
    private String memberId;
    private String memberPassword;
    private String memberName;
    private String memberAdress1;
    private String memberPhoneNum;

    public static MemberDTO memberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberId(memberEntity.getMemberId());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        memberDTO.setMemberAdress1(memberEntity.getMemberAdress1());
        memberDTO.setMemberPhoneNum(memberEntity.getMemberPhoneNum());
        return memberDTO;

    }
}
