package com.project.littlebank.sample.mybatis.repository;

import com.project.littlebank.sample.mybatis.dto.TestEntity;
import org.apache.ibatis.annotations.Mapper;


//mapper에 있는 id를 repository에 만들기
@Mapper
public interface TestRepository {


    //id와 이름을 같게하면 이것을 사용하면 xml 파일의 sql 이 실행됨
    void insertBanker(TestEntity entity);


}
