package com.project.littlebank.sample.jpa.service;

import com.project.littlebank.sample.jpa.entity.TestExample;

public interface TestJpaService {


    void jpaSave(TestExample testExample);

    String jpaFind(String id);


}
