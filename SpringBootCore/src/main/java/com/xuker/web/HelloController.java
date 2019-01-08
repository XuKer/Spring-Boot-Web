package com.xuker.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@Controller + @ResponseBody
@RestController
public class HelloController {
    @Value("${student.name}")
    private String stuName;
    @Value("${student.age}")
    private String stuAge;
    @RequestMapping("/hello")
    public String index() {
        return "作者："+stuName+",今年："+stuAge+"岁.";
    }

}