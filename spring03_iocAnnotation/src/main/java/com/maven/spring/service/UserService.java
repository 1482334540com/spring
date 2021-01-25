package com.maven.spring.service;

import com.maven.spring.dao.UserDao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 在注解里面 value属性值可以不写 如果不写就是 默认类名的第一个首字母小写
 */
@Service(value = "userService") //创建userService对象
public class UserService {
    // 不需要添加set方法 添加注解属性即可
   @Resource(name = "userDaoImpl")
    private UserDao userDao;
   @Value(value = "卡夫卡")
   private String name ;

    public  void add(){
        userDao.add();
        System.out.println("service add ...."+name);
    }
}
