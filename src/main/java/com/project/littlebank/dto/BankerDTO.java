package com.project.littlebank.dto;


import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;


@Data
@NoArgsConstructor



public class BankerDTO {
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


}


