package com.project.littlebank.user.signup.jpa.entity;

import com.project.littlebank.user.signup.jpa.converter.Aes256Converter;
import com.project.littlebank.user.signup.jpa.dto.CustomerRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigInteger;

@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "TESTBANKER_USER")
public class TestBankerUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TESTBANKER_USER")
    @SequenceGenerator(name = "SEQ_TESTBANKER_USER", sequenceName = "SEQ_TESTBANKER_USER", allocationSize = 1)
    private BigInteger cusNum;
    private String cusName;
    private String cusGrade;
    private String cusId;
    @Convert(converter = Aes256Converter.class)
    private String cusPassword;
    private String cusAddr1;
    private String cusAddr2;
    private String cusTel;
    private String cusPhone;
    private String useYn;


    public TestBankerUser(CustomerRequestDTO customerRequestDTO){
        this.cusName = customerRequestDTO.getCustomerName();
        this.cusGrade = "신규";
        this.cusId = customerRequestDTO.getCustomerId();
        this.cusPassword = customerRequestDTO.getCustomerPassword();
        this.cusAddr1 = customerRequestDTO.getCustomerAddr1();
        this.cusAddr2 = customerRequestDTO.getCustomerAddr2();
        this.cusTel = customerRequestDTO.getCustomerTel();
        this.cusPhone = customerRequestDTO.getCustomerPhone();
        this.useYn = "Y";
    }

    public void setUseYn(String useYn) {
        this.useYn = useYn;
    }


}

