package com.project.littlebank.domain.member.entity;

import com.project.littlebank.domain.member.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {
    @Id
    private Long id;

    private String memberEmail;
    private String memberPassword;
    private String memberId;
    private String memberName;
    private String memberAdress1;
    private String memberPhoneNum;

    public static MemberEntity toMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberId(memberDTO.getMemberId());
        memberEntity.setMemberAdress1(memberDTO.getMemberAdress1());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setMemberPhoneNum(memberDTO.getMemberPhoneNum());
        memberEntity.setMemberName(memberDTO.getMemberName());
        return memberEntity;
    }
    public static MemberEntity toUpdateMemberEntity(MemberDTO memberDTO) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setId(memberDTO.getId());
        memberEntity.setMemberId(memberDTO.getMemberId());
        memberEntity.setMemberAdress1(memberDTO.getMemberAdress1());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setMemberPhoneNum(memberDTO.getMemberPhoneNum());
        memberEntity.setMemberName(memberDTO.getMemberName());
        return memberEntity;
    }

}
