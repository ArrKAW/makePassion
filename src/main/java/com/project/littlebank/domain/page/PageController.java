package com.project.littlebank.domain.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/main")
    public String mainPage(){
        return "main";
    }


    @GetMapping("/sample")
    public String sample(){
        return "sample";
    }




}
