package com.project.littlebank.sample.jpa.service;

import com.project.littlebank.sample.jpa.entity.TestExample;
import com.project.littlebank.sample.jpa.repository.TestJpaRepository;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class TestJpaServiceImpl implements TestJpaService{

    private final TestJpaRepository testJpaRepository;


    @Override
    public void jpaSave(TestExample testExample) {
        TestExample jpaSaveObj = new TestExample(testExample.getId(), testExample.getNum(), testExample.getContent());
        testJpaRepository.save(jpaSaveObj);

    }

    @Override
    public String jpaFind(String id) {

        Optional<TestExample> byId = testJpaRepository.findById(id);
        byId.orElseThrow(EntityNotFoundException::new);

        TestExample testExample = byId.get();

        return testExample.getContent();
    }
}
