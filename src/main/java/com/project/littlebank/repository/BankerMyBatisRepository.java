package com.project.littlebank.repository;


import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.entity.Banker;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class BankerMyBatisRepository {

    private final SqlSessionTemplate sql;

    public Banker bankerLogin(BankerDTO bankerDTO){
        return sql.selectOne("Banker.login", bankerDTO);
    }

    public Banker find(String bankerId){
        return sql.selectOne("Banker.find", bankerId);
    }

    public int update(Banker banker){
        return sql.update("Banker.update", banker);
    }
}
