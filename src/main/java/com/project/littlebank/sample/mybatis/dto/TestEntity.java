package com.project.littlebank.sample.mybatis.dto;

import com.project.littlebank.sample.mybatis.dao.TestRequestDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

//java 코드를 쓸때는 스네이크 케이스가 아니라 카멜케이스 사용 <- 검색해 보도록

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TestEntity {

    private String bSeq;
    private String bId;
    private String bPwd;
    private String bName;
    private String bPosition;
    private String bTel;
    private String userUseYn;
    private Date bLastUseDate;
    private String regId;
    private Date regDate;
    private String chgId;
    private Date chgDate;
    private String dept;
    private String basicAuth;

    //dto 정보를 test Entity 에 넣어준다 그러면서 필요한 다른 정보들 입력
    public TestEntity(TestRequestDTO dto){
        this.bSeq = String.valueOf(Math.random());
        this.bId = dto.getId();
        this.bPwd = dto.getPwd();
        this.bName = dto.getName();
        this.bPosition = dto.getPosition();
        this.bTel = dto.getTel();
        this.userUseYn = "Y";
        this.regId = "용휘";
        this.dept = dto.getDept();
    }

}

