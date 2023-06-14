package com.project.littlebank.domain.member.repository;

import com.project.littlebank.domain.member.dto.MemberDTO;
import com.project.littlebank.sample.mybatis.dto.MybatisDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;


@Mapper

public interface MemberRepository {
    String login1(String userId);
    MemberDTO findMember(String userId, String userPassword);
    @Select("select * from testbanker_User" +
            "where cus_Id = #{userId} " +
            "and cus_Password = #{userPassword}")
    String login2(String userPassword);

}

