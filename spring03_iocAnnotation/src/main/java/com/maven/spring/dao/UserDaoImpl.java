package com.maven.spring.dao;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository(value = "userDaoImpl")  //创建UserDaoImpl 对象
public class UserDaoImpl implements UserDao {

    @Override
    public void add() {
        System.out.println("dao add.....");
    }
}
