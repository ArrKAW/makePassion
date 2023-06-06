package com.project.littlebank.entity;

import com.project.littlebank.dto.BankerDTO;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@Table(name = "TESTBANKER")
public class Banker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="B_SEQ")
    private String bseq;
    @Column(name="B_ID")
    private String bid;
    @Column(name="B_NAME")
    private String bname;
    @Column(name="B_PWD")
    private String bpwd;
    @Column(name="B_POSITION")
    private String bposition;
    @Column(name="B_TEL")
    private String btel;
    @Column(name="USER_USE_YN")
    private String useruseyn;
    @Column(name="B_LAST_USE_TIME")
    private Date blastusetime;
    @Column(name="REG_ID")
    private String regid;
    @Column(name="REG_DATE")
    private Date regdate;
    @Column(name="CHG_ID")
    private String chgid;
    @Column(name="CHG_DATE")
    private Date chgdate;
    @Column(name="DEPT")
    private String dept;
    @Column(name="BASIC_AUTH")
    private String basicauth;

    public Banker(BankerDTO bankerDTO){
        this.bid = bankerDTO.getBankerId();
        this.bname = bankerDTO.getBankerName();
        this.bpwd = bankerDTO.getBankerPwd();
        this.bposition = bankerDTO.getBankerPosition();
        this.btel = bankerDTO.getBankerTel();
        this.useruseyn = bankerDTO.getBanker_use_yn();
        this.blastusetime = bankerDTO.getBanker_last_use_time();
        this.regid = bankerDTO.getBanker_reg_id();
        this.regdate = bankerDTO.getBanker_reg_date();
        this.chgid = bankerDTO.getBanker_chg_id();
        this.chgdate = bankerDTO.getBanker_chg_date();
        this.dept = bankerDTO.getBanker_dept();
        this.basicauth = bankerDTO.getBanker_basic_auth();
    }

}
