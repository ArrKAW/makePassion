package com.project.littlebank.sample.mybatis.service;

import com.project.littlebank.sample.mybatis.dao.TestRequestDTO;
import com.project.littlebank.sample.mybatis.dto.MybatisDTO;

public interface MybatisService {

    void mapperSave(MybatisDTO mybatisDTO);

    void noMapperSave(MybatisDTO mybatisDTO);

    String mapperFind(String aaa);

    String noMapperFind(String bbb);

    //여기에 메서드를 지정해주고 impl 에서 구현
    void singUpBanker(TestRequestDTO dto);

}
