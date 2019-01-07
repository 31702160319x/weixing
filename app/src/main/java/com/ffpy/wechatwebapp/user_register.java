package com.ffpy.wechatwebapp;

/**
 * Created by Administrator on 2019/1/7.
 */

public class user_register {
    private String name,user,password,status;

    public user_register(String name, String user, String password, String status) {
        this.name = name;
        this.user = user;
        this.password = password;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
