package com.maven.spring.dao.impl;

import com.maven.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    /**
     * 注入属性外部
     */


    @Override
    public void update() {
        System.out.println("修改成功");
    }
}
