package com.project.littlebank.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "testBanker2")
public class Banker {
    @Id
    private String b_seq;
    private String b_id;
    private String b_name;
    private String b_pwd;
    private String b_position;
    private String b_tel;
    private String user_use_yn;
    private Date b_last_use_time = new Date();
    private String reg_id;
    private Date reg_date = new Date();
    private String chg_id;
    private Date chg_date = new Date();
    private String dept;
    private String basic_auth;

    public String getB_Id(){
        return b_id;
    }

    public String getB_pwd(){
        return b_pwd;
    }

}
