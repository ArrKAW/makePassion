package com.project.littleBank.sample.mybatis.service;

import com.project.littleBank.sample.mybatis.dto.MybatisDTO;

public interface MybatisService {

    void mapperSave(MybatisDTO mybatisDTO);

    void noMapperSave(MybatisDTO mybatisDTO);

    String mapperFind(String aaa);

    String noMapperFind(String bbb);

}
