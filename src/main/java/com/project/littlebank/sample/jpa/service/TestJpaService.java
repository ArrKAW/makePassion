package com.project.littleBank.sample.jpa.service;

import com.project.littleBank.sample.jpa.entity.TestExample;

public interface TestJpaService {


    void jpaSave(TestExample testExample);

    String jpaFind(String id);


}
