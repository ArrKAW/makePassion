package com.project.littlebank.dto;


import com.project.littlebank.entity.Banker;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;


@Data
@NoArgsConstructor



public class BankerDTO {
    private String bankerSeq;
    private String bankerId;
    private String bankerName;
    private String bankerPwd;
    private String bankerPosition;
    private String bankerTel;
    private String banker_use_yn;
    private Date banker_last_use_time;
    private String banker_reg_id;
    private Date banker_reg_date;
    private String banker_chg_id;
    private Date banker_chg_date;
    private String banker_dept;
    private String banker_basic_auth;

    public BankerDTO(Banker banker){
        this.bankerSeq = banker.getBseq();
        this.bankerId = banker.getBid();
        this.bankerName = banker.getBname();
        this.bankerPwd = banker.getBpwd();
        this.bankerPosition = banker.getBposition();
        this.bankerTel = banker.getBtel();
        this.banker_use_yn = banker.getUseruseyn();
        this.banker_last_use_time = banker.getBlastusetime();
        this.banker_reg_id = banker.getRegid();
        this.banker_reg_date = banker.getRegdate();
        this.banker_chg_id = banker.getChgid();
        this.banker_chg_date = banker.getChgdate();
        this.banker_dept = banker.getDept();
        this.banker_basic_auth = banker.getBasicauth();
    }



}


