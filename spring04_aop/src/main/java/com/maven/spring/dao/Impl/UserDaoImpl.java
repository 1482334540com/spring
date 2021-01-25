package com.maven.spring.dao.Impl;

import com.maven.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    /**
     * 实现两个数相加
     *
     * @param a 参数1
     * @param b 参数2
     * @return 返回两个数相加得到和
     */
    @Override
    public int add(int a, int b) {

        return a+b;
    }

    @Override
    public String update(String id) {

        return id;

    }
}
