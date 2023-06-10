package com.project.littleBank.sample.mybatis.controller;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import com.project.littleBank.sample.mybatis.dto.MybatisDTO;
import com.project.littleBank.sample.mybatis.service.MybatisService;

@Controller
@RequiredArgsConstructor
@Api(tags = {"샘플 데이터 Mybatis API"})
public class MybatisController {

    private final MybatisService mybatisService;

    @ApiOperation(value = "mapper 사용 저장")
    @PostMapping("v1/sample/mapper")
    public ResponseEntity sampleMapperRegister(
            @RequestBody MybatisDTO mybatisDTO
    ){
        mybatisService.mapperSave(mybatisDTO);
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "mapper 사용 안한 저장")
    @PostMapping("v1/sample/no_mapper")
    public ResponseEntity sampleNoMapperRegister(
            @RequestBody MybatisDTO mybatisDTO
    ){
        mybatisService.noMapperSave(mybatisDTO);
        return ResponseEntity.ok().build();

    }

    @ApiOperation(value = "mapper 사용 찾기")
    @GetMapping("v1/sample/mapper")
    public ResponseEntity sampleMapperFind(
            @RequestParam String aaa
    ){
        String result = mybatisService.mapperFind(aaa);
        return ResponseEntity.ok().body(result);
    }

    @ApiOperation(value = "mapper 사용 찾기")
    @GetMapping("v1/sample/no_mapper")
    public ResponseEntity sampleNoMapperFind(
            @RequestParam String bbb
    ){
        String result = mybatisService.noMapperFind(bbb);

        return ResponseEntity.ok().body(result);
    }


}
