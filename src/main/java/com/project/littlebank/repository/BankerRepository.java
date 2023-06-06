package com.project.littlebank.repository;

import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.entity.Banker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankerRepository extends JpaRepository<Banker, String> {

    Banker findByBidAndBpwd(String bankerId, String bankerPwd);
}
