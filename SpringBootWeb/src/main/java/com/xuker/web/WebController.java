package com.xuker.web;


import com.xuker.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

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
}