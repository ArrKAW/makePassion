package sample.jpa.service;

import sample.jpa.entity.TestExample;

public interface TestJpaService {


    void jpaSave(TestExample testExample);

    String jpaFind(String id);


}
