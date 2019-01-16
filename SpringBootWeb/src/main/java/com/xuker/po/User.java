package com.xuker.po;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
@ApiModel(value="用户对象")
public class User implements Serializable {
    @ApiModelProperty(value="id" )
    private Integer id;
    @ApiModelProperty(value="用户姓名" ,required=true)
    private String userName;
    @ApiModelProperty(value="用户密码" ,required=true)
    private String password;

    private Integer age;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}