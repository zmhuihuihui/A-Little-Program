package com.entity;

import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

public class User {

    private String username;
    private String password;

    //对前台的日期进行格式转换
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
