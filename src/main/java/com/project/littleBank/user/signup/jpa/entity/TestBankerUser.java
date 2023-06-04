package com.project.littleBank.user.signup.jpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Entity
@Table(name = "TESTBANKER_USER")
public class TestBankerUser {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TESTBANKER_USER")
    @SequenceGenerator(name = "SEQ_TESTBANKER_USER", sequenceName = "SEQ_TESTBANKER_USER", allocationSize = 1)
    private BigInteger CUS_NUM;
    private String CUS_NAME;
    private String CUS_GRADE;
    private String CUS_ID;
    private String CUS_PASSWORD;
    private String CUS_ADDR1;
    private String CUS_ADDR2;
    private String CUS_TEL;
    private String CUS_PHONE;
    @Column(columnDefinition = "varchar(2) default 'Y'")
    private String USE_YN = "Y";

    public TestBankerUser() {
    }

    public TestBankerUser(BigInteger CUS_NUM, String CUS_NAME, String CUS_GRADE, String CUS_ID, String CUS_PASSWORD, String CUS_ADDR1, String CUS_ADDR2, String CUS_TEL, String CUS_PHONE, String USE_YN) {

        this.CUS_NUM = CUS_NUM;
        this.CUS_NAME = CUS_NAME;
        this.CUS_GRADE = CUS_GRADE;
        this.CUS_ID = CUS_ID;
        this.CUS_PASSWORD = CUS_PASSWORD;
        this.CUS_ADDR1 = CUS_ADDR1;
        this.CUS_ADDR2 = CUS_ADDR2;
        this.CUS_TEL = CUS_TEL;
        this.CUS_PHONE = CUS_PHONE;
        this.USE_YN = USE_YN;

    }

    public BigInteger getCUS_NUM() {
        return CUS_NUM;
    }

    public String getCUS_NAME() {
        return CUS_NAME;
    }

    public String getCUS_GRADE() {
        return CUS_GRADE;
    }

    public String getCUS_ID() {
        return CUS_ID;
    }

    public String getCUS_PASSWORD() {
        return CUS_PASSWORD;
    }

    public String getCUS_ADDR1() {
        return CUS_ADDR1;
    }

    public String getCUS_ADDR2() {
        return CUS_ADDR2;
    }

    public String getCUS_TEL() {
        return CUS_TEL;
    }

    public String getCUS_PHONE() {
        return CUS_PHONE;
    }

    public String getUSE_YN() {
        return USE_YN;
    }



    public void setCUS_NAME(String CUS_NAME) {
        this.CUS_NAME = CUS_NAME;
    }

    public void setCUS_ID(String CUS_ID) {
        this.CUS_ID = CUS_ID;
    }

    public void setCUS_PASSWORD(String CUS_PASSWORD) {
        this.CUS_PASSWORD = CUS_PASSWORD;
    }

    public void setCUS_ADDR1(String CUS_ADDR1) {
        this.CUS_ADDR1 = CUS_ADDR1;
    }

    public void setCUS_ADDR2(String CUS_ADDR2) {
        this.CUS_ADDR2 = CUS_ADDR2;
    }

    public void setCUS_TEL(String CUS_TEL) {
        this.CUS_TEL = CUS_TEL;
    }

    public void setCUS_PHONE(String CUS_PHONE) {
        this.CUS_PHONE = CUS_PHONE;
    }



}

