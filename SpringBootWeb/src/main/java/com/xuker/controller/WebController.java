package com.xuker.controller;


import com.xuker.dto.Person;
import com.xuker.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {
    @Autowired
    private RedisUtil redisUtil;
    @RequestMapping("/")
    public String index(Model model){
        Person single = new Person("xuker",18);

        List<Person> people = new ArrayList<Person>();
        Person p1 = new Person("mao1",18);
        Person p2 = new Person("mao2",19);
        Person p3 = new Person("mao3",20);
        people.add(p1);
        people.add(p2);
        people.add(p3);
        model.addAttribute("singlePerson", single);
        model.addAttribute("people", people);
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(){
        redisUtil.set("xuker","xuker20190122");
        return "hello";
    }

}