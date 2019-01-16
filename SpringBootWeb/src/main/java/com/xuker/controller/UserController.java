package com.xuker.controller;

import com.xuker.po.User;
import com.xuker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:XuKe
 * @CreateOn:2019-01-15 14:03
 * @Email ：wxk1035@gmail.com
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/showUser")
    @ResponseBody
    public User toIndex(HttpServletRequest request, Model model){
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        return user;
    }
    @RequestMapping("/addUser")
    @ResponseBody
    public String addUser(HttpServletRequest request, Model model){
        User user =new User();
        user.setId(4);
        user.setAge(18);
        user.setPassword("000");
        user.setUserName("222");
        Map map=new HashMap();
        map.put("id",1);
        map.put("userName","wxk111");
        userService.updateUser(user,map);
        return "";
    }
}
