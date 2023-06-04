package com.project.littlebank.user.signup.jpa.entity;

import com.project.littlebank.user.signup.jpa.dto.UserRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@Entity
@Table(name = "TESTBANKER_USER")
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TestBankerUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TESTBANKER_USER")
    @SequenceGenerator(name = "SEQ_TESTBANKER_USER", sequenceName = "SEQ_TESTBANKER_USER", allocationSize = 1)
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

    public TestBankerUser(UserRequestDTO userRequestDTO){
        this.cusName = userRequestDTO.getUserName();
        this.cusId = userRequestDTO.getUserId();
        this.cusPassword = userRequestDTO.getUserPassword();
        this.cusAddr1 = userRequestDTO.getUserAddr1();
        this.cusAddr2 = userRequestDTO.getUserAddr2();
        this.cusTel = userRequestDTO.getUserTel();
        this.cusPhone = userRequestDTO.getUserPhone();
        this.useYn = "Y";
        this.cusGrade = "신규";
    }


}

