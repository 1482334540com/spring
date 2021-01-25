package com.maven.spring.service;


import com.maven.spring.dao.UserDao;

public class UserService {

    //创建UserDao类型属性 生成get方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public  void login(){
        userDao.update();
        System.out.println("登录成功");
    }
}
