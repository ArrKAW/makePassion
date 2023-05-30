package sample.mybatis.service;

import sample.mybatis.dto.MybatisDTO;

public interface MybatisService {

    void mapperSave(MybatisDTO mybatisDTO);

    void noMapperSave(MybatisDTO mybatisDTO);

    String mapperFind(String aaa);

    String noMapperFind(String bbb);

}
