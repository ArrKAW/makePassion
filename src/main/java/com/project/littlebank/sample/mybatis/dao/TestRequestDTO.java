package com.project.littlebank.sample.mybatis.dao;

import lombok.Data;

// 홈페이지에서 사용자에게 받을 정보를 넣은곳

@Data
public class TestRequestDTO {

    private String id;
    private String pwd;
    private String name;
    private String position;
    private String tel;
    private String useYn;
    private String dept;

}
