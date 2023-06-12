package com.project.littlebank.entity;

import com.project.littlebank.dto.BankerDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TESTBANKER")
@Getter
public class Banker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="B_SEQ")
    private String bankerSeq;
    @Column(name="B_ID")
    private String bankerId;
    @Column(name="B_NAME")
    private String bankerName;
    @Column(name="B_PWD")
    private String bankerPwd;
    @Column(name="B_POSITION")
    private String bankerPosition;
    @Column(name="B_TEL")
    private String bankerTel;
    @Column(name="USER_USE_YN")
    private String userUseYn;
    @Column(name="B_LAST_USE_TIME")
    private Date bankerLastUseTime;
    @Column(name="REG_ID")
    private String registerId;
    @Column(name="REG_DATE")
    private Date registerDate;
    @Column(name="CHG_ID")
    private String changeId;
    @Column(name="CHG_DATE")
    private Date changeDate;
    @Column(name="DEPT")
    private String bankerDept;
    @Column(name="BASIC_AUTH")
    private String basicAuth;

    public Banker(BankerDTO bankerDTO){
        this.bankerSeq = bankerDTO.getSeq();
        this.bankerId = bankerDTO.getId();
        this.bankerName = bankerDTO.getName();
        this.bankerPwd = bankerDTO.getPwd();
        this.bankerPosition = bankerDTO.getPosition();
        this.bankerTel = bankerDTO.getTel();
        this.userUseYn = bankerDTO.getUseYn();
        this.bankerLastUseTime = bankerDTO.getLastUseTime();
        this.registerId = bankerDTO.getRegId();
        this.registerDate = bankerDTO.getRegDate();
        this.changeId = bankerDTO.getChgId();
        this.changeDate = bankerDTO.getChgDate();
        this.bankerDept = bankerDTO.getDept();
        this.basicAuth = bankerDTO.getBasAuth();
    }

}
