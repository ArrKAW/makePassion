package sample.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sample.jpa.entity.TestExample;

public interface TestJpaRepository extends JpaRepository<TestExample, String> {


}
