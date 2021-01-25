package com.maven.spring.service;

import com.maven.spring.bean.User;

import java.util.List;

public interface UserService {
    /**
     * 添加一个user对象
     * @param user 需要传入一个user对象
     * @return 返回影响的行数
     */
    int add (User user);

    /**
     * 查询表中所有的用户信息,然后封装到List集合中
     * @return 返回一个装有user对象的List集合
     */
    List<User> selectUser();
}
