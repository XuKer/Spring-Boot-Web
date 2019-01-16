package com.xuker.dao;

import com.xuker.po.User;
import com.xuker.po.UserExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int insert(User record);

    int insertSelective(User record);
     User selectByPrimaryKey(int id);
    List<User> selectByExample(UserExample example);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(Map map);
}