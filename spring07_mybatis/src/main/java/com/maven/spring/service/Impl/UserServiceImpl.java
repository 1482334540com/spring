package com.maven.spring.service.Impl;

import com.maven.spring.bean.User;
import com.maven.spring.dao.UserDao;
import com.maven.spring.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    //引用类型
    private UserDao userDao;
     //spring框架使用set方法进行赋值
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public int add(User user) {
        int updateCount = userDao.add(user);
        return updateCount;
    }

    @Override
    public List<User> selectUser() {
        List<User> userList = userDao.selectUser();
        return userList;
    }
}
