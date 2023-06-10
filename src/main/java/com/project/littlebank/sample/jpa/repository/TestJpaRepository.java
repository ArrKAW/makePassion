package com.project.littleBank.sample.jpa.repository;

import com.project.littleBank.sample.jpa.entity.TestExample;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestJpaRepository extends JpaRepository<TestExample, String> {


}
