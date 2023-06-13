package com.project.littlebank.sample.mybatis.controller;

import com.project.littlebank.sample.mybatis.dao.TestRequestDTO;
import com.project.littlebank.sample.mybatis.service.MybatisService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class SignUpController {


    private final MybatisService mybatisService;

    public SignUpController(MybatisService mybatisService) {
        this.mybatisService = mybatisService;
    }


    // test.xml 파일에서 insert 작업은 postMapping 으로 보낸다
    @PostMapping("/signup")
    public String singUp(@RequestBody TestRequestDTO dto){

        mybatisService.singUpBanker(dto);

        return "/signup";
    }
}
