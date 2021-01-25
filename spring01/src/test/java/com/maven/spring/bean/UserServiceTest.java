package com.maven.spring.bean;

import com.maven.spring.dao.impl.UserDaoImpl;
import com.maven.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {
//外部bean
    @Test
    void externalBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.login();
    }

    //内部bean
    @Test
    void internalBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.init();

    }

    //级联 bean
    @Test
    void cascadeBean() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.init();

    }

}