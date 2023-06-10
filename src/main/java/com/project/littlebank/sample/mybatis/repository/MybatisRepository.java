package com.project.littleBank.sample.mybatis.repository;

import com.project.littleBank.sample.mybatis.dto.MybatisDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MybatisRepository {

    void save1(MybatisDTO mybatisDTO);

    @Insert("insert into " +
            "aaa(aaa, bbb) " +
            "values( #{aaa}, #{bbb} ) ")
    void save2(MybatisDTO mybatisDTO);

    String find1(String aaa);

    @Select("select a.aaa from aaa a" +
            " where a.bbb = #{bbb} ")
    String find2(String bbb);

}
