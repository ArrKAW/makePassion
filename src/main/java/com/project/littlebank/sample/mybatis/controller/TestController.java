package com.project.littlebank.sample.mybatis.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.project.littlebank.sample.mybatis.dao.TestDAO;
import com.project.littlebank.sample.mybatis.dto.TestEntity;

@Controller
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestDAO newDAO;

    @RequestMapping("/test")
    public @ResponseBody Map<String, Object> test() throws Exception {
            Map<String, Object> rtnObj = new HashMap<>();

            List<TestEntity> testList = newDAO.listBank();
            logger.info("test->" + testList.toString());

            rtnObj.put("test_list", testList);
            return rtnObj;
        }
    }

