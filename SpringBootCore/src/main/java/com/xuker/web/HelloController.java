package com.xuker.web;

import com.xuker.dto.UserSetting;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserSetting ust;
    @RequestMapping("/hello")
    public String index() {
        return "作者："+stuName+",今年："+stuAge+"岁,工作在"+ust.getAddr()+"的一名"+ust.getSex()+"程序员";
    }

}