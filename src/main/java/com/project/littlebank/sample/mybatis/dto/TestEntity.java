package com.project.littlebank.sample.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class TestEntity {
    private String B_SEQ;
    private String B_ID;
    private String B_PWD;
    private String B_NAME;
    private String B_POSITION;
    private String B_TEL;
    private String USER_USE_YN;
    private Date B_LAST_USE_TIME;
    private String REG_ID;
    private Date REG_DATE;
    private String CHG_ID;
    private Date CHG_DATE;
    private String DEPT;
    private String BASIC_AUTH;

}

