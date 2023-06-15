package com.project.littlebank.repository;

import com.project.littlebank.dto.BankerDTO;
import com.project.littlebank.entity.Banker;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

@Mapper
public interface BankerMyBatisRepository {
    public Banker login(BankerDTO bankerDTO);
    public Banker find(String bankerId);
    public int update(Banker banker);
}
