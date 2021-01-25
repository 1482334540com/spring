package com.maven.spring.service;

import com.maven.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserDaoService {

    @Autowired
    private UserDao userDao;
    @Transactional() //开启事务管理 可以添加到类上 可以添加到方法上 添加到类上就是类中所有的方法都开启事务管理
    public void accountMoney() {

        // 1.开启事务操作

           //admin 少100  root多100  2.事务开启事务
           //减钱
           userDao.reduceMoney();
           //模拟异常
           int i = 20/0;
           //加钱
           userDao.addMoney();
           //3.没有异常 提交事务

           //4.出现异常 事务回滚

    }


}
