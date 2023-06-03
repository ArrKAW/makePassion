package com.project.littlebank.domain.member.entity;

import com.project.littleBank.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "member_table")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //
    private Long id;

    @Column(unique = true)
    private String memberEmail;

    @Column
    private String memberPassword;
    @Column
    private String memberId;
    @Column
    private String memberName;
    @Column
    private String memberAdress1;
    @Column
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
