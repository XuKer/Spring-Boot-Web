package com.xuker.dto;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author:XuKe
 * @CreateOn:2019-01-08 17:00
 * @Email ：wxk1035@gmail.com
 */
@Component
@ConfigurationProperties(prefix = "user",locations = {"classpath:config/user.properties"})
public class UserSetting {
    private String addr;
    private String sex;

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
