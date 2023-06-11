package com.project.littlebank.domain.member.repository;

import com.project.littlebank.domain.member.dto.MemberDTO;
import jakarta.persistence.SqlResultSetMapping;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;


@Mapper

public interface MemberRepository {
    public MemberDTO getMember(MemberDTO memberDTO) throws  Exception;

}
