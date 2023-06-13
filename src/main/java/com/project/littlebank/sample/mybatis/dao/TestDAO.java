package com.project.littlebank.sample.mybatis.dao;

import java.util.List;

import com.project.littlebank.sample.mybatis.dto.TestEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TestDAO {
    List<TestEntity> listBank();
}