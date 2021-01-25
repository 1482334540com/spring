package com.maven.spring.dao.Impl;


import com.maven.spring.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository //创建BookDaoImpl对象
public class UserDaoImpl implements UserDao {

//注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    /**
     * 增加钱的方法  admin转100给root root+100
     */
    @Override
    public void addMoney() {
        String sql ="update count set money=money+? where username=?";
        int update = jdbcTemplate.update(sql, 100, "root");
        System.out.println(update);
    }

    /**
     * 减钱的方法 admin转100给root admin-100
     */
    @Override
    public void reduceMoney() {
        String sql ="update count set money=money-? where username=?";
        int update = jdbcTemplate.update(sql, 100, "admin");
        System.out.println(update);
    }
}
