package com.project.littlebank.domain.member.repository;

import com.project.littlebank.domain.member.dto.MemberDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberRepository {
    public MemberDTO getSelectOne(MemberDTO memberDTO)throws Exception;
}
