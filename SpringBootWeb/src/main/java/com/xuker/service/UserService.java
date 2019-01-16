package com.xuker.service;

import com.xuker.dao.UserMapper;
import com.xuker.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @Author:XuKe
 * @CreateOn:2019-01-15 13:55
 * @Email ：wxk1035@gmail.com
 */
@Service("userService")
public class UserService {
    @Autowired
    private UserMapper userDao;


    public User getUserById(int userId) {
        System.out.println(userDao.selectByPrimaryKey(userId));
        return userDao.selectByPrimaryKey(userId);
    }

    public boolean addUser(User record){
        boolean result = false;
        try {
            userDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }
    public boolean updateUser(User record,Map map){
        boolean result = false;

        int n=userDao.insertSelective(record);
        System.out.println(n);
         int m=userDao.updateByExample(map);
         System.out.println(m);

        return result;
    }
}
