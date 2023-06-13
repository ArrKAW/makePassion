package com.project.littlebank.sample.mybatis.service;

import com.project.littlebank.sample.mybatis.dao.TestRequestDTO;
import com.project.littlebank.sample.mybatis.dto.TestEntity;
import com.project.littlebank.sample.mybatis.repository.TestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.project.littlebank.sample.mybatis.dto.MybatisDTO;
import com.project.littlebank.sample.mybatis.repository.MybatisRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class MybatisServiceImpl implements MybatisService {

    private final MybatisRepository mybatisRepository;
    private final TestRepository testRepository;

    @Override
    public void mapperSave(MybatisDTO mybatisDTO) {
        mybatisRepository.save1(mybatisDTO);
    }

    @Override
    public void noMapperSave(MybatisDTO mybatisDTO) {
        mybatisRepository.save2(mybatisDTO);
    }

    @Override
    public String mapperFind(String aaa) {
        return mybatisRepository.find1(aaa);
    }

    @Override
    public String noMapperFind(String bbb) {
        return mybatisRepository.find2(bbb);
    }

    @Override
    public void singUpBanker(TestRequestDTO dto) {
        //dto 를 TestEntity 안에다 집어넣었다 (TestEntity 참고)
        TestEntity entity = new TestEntity(dto);

        //Entity에 내용을 repository에 넣어서 입력 xml의 # 안의 변수들을 보면 이해 가능
        testRepository.insertBanker(entity);

    }
}
