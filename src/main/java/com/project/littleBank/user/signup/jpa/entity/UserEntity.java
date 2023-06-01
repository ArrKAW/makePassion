package com.project.littleBank.user.signup.jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class UserEntity {

    @Id
    private int cus_num;
    private String cus_name;
    private String cus_grade;
    private String cus_id;
    private String cus_password;
    private String cus_addr1;
    private String cus_addr2;
    private String cus_tel;
    private String cus_phone;
    private String use_yn;

    public UserEntity() {
    }

    public UserEntity(int cus_num, String cus_name, String cus_grade, String cus_id, String cus_password, String cus_addr1, String cus_addr2, String cus_tel, String cus_phone, String use_yn) {

        this.cus_num = cus_num;
        this.cus_name = cus_name;
        this.cus_grade = cus_grade;
        this.cus_id = cus_id;
        this.cus_password = cus_password;
        this.cus_addr1 = cus_addr1;
        this.cus_addr2 = cus_addr2;
        this.cus_tel = cus_tel;
        this.cus_phone = cus_phone;
        this.use_yn = use_yn;

    }

    public int getCus_num() {
        return cus_num;
    }

    public String getCus_name() {
        return cus_name;
    }

    public String getCus_grade() {
        return cus_grade;
    }

    public String getCus_id() {
        return cus_id;
    }

    public String getCus_password() {
        return cus_password;
    }

    public String getCus_addr1() {
        return cus_addr1;
    }

    public String getCus_addr2() {
        return cus_addr2;
    }

    public String getCus_tel() {
        return cus_tel;
    }

    public String getCus_phone() {
        return cus_phone;
    }

    public String getUse_yn() {
        return use_yn;
    }
}

