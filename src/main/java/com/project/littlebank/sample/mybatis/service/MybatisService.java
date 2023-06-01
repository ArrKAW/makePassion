package com.project.littlebank.sample.mybatis.service;

import com.project.littlebank.sample.mybatis.dto.MybatisDTO;

public interface MybatisService {

    void mapperSave(MybatisDTO mybatisDTO);

    void noMapperSave(MybatisDTO mybatisDTO);

    String mapperFind(String aaa);

    String noMapperFind(String bbb);

}
