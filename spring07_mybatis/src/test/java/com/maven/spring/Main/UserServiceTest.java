package com.maven.spring.Main;


import com.maven.spring.bean.User;

import com.maven.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserServiceTest {


//测试容器中的对象是否成功创建
    @Test
    public void testAccountMoney() {
       String config = "applicationContext.xml";
        ApplicationContext context =new ClassPathXmlApplicationContext(config);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("容器中的对象"+beanDefinitionName);
        }
    }

//测试添加操作
    @Test
    public void testUserServiceAdd() {
        String config = "applicationContext.xml";
        ApplicationContext context =new ClassPathXmlApplicationContext(config);
        UserService service = context.getBean("userService", UserService.class);
        int add = service.add(new User(null, "test", "123456"));
        //spring 和mybatis整合在一起的时候是默认自动提交事务的
        System.out.println(add);
    }

    @Test
    public void testUserServiceSelect() {
        String config = "applicationContext.xml";
        ApplicationContext context =new ClassPathXmlApplicationContext(config);
        UserService service = context.getBean("userService", UserService.class);
        List<User> userList = service.selectUser();
        for (User user : userList) {
            System.out.println(user);
        }

    }
}
