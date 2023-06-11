/*
package com.project.littlebank.domain.member.entity;


import com.project.littlebank.domain.member.dto.MemberDTO;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigInteger;

@Entity
@Table
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Q_MEMBER_ENTITY")
    @SequenceGenerator(name = "Q_MEMBER_ENTITY", sequenceName = "Q_MEMBER_ENTITY", allocationSize = 1)
    private BigInteger cusNum;
    private String cusName;

    private String cusGrade;
    private String cusId;
    private String cusPassword;
    private String cusAddr1;
    private String cusAddr2;
    private String cusTel;
    private String cusPhone;
    private String useYn;

    public MemberEntity(MemberDTO memberDTO){
        this.cusName = memberDTO.getUserName();
        this.cusId = memberDTO.getUserId();
        this.cusPassword = memberDTO.getUserPassword();
        this.cusAddr1 = memberDTO.getUserAddr1();
        this.cusAddr2 = memberDTO.getUserAddr2();
        this.cusTel = memberDTO.getUserTel();
        this.cusPhone = memberDTO.getUserPhone();
    }


}
*/