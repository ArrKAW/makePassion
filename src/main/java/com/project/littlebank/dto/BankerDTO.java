package com.project.littlebank.dto;


import com.project.littlebank.entity.Banker;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;


@Data
@NoArgsConstructor

public class BankerDTO {
    private String seq;
    private String id;
    private String name;
    private String pwd;
    private String position;
    private String tel;
    private String useYn;
    private Date lastUseTime;
    private String regId;
    private Date regDate;
    private String chgId;
    private Date chgDate;
    private String dept;
    private String basAuth;

    public BankerDTO(Banker banker){
        this.seq = banker.getBankerSeq();
        this.id = banker.getBankerId();
        this.name = banker.getBankerName();
        this.pwd = banker.getBankerPwd();
        this.position = banker.getBankerPosition();
        this.tel = banker.getBankerTel();
        this.useYn = banker.getUserUseYn();
        this.lastUseTime = banker.getBankerLastUseTime();
        this.regId = banker.getRegisterId();
        this.regDate = banker.getRegisterDate();
        this.chgId = banker.getChangeId();
        this.chgDate = banker.getChangeDate();
        this.dept = banker.getBankerDept();
        this.basAuth = banker.getBasicAuth();
    }

}


