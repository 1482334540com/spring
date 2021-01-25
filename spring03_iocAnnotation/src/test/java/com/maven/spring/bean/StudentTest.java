package com.maven.spring.bean;


import com.maven.spring.config.SpringConfig;
import com.maven.spring.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class StudentTest {

    //使用注解的方式创建对象
    @Test
    void serviceAnnotationMethods() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);

    }
    //使用注解的方式创建对象 并且给对象的属性赋值
    @Test
    void autoConfigAttributeAnnotationMethods() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);

    }
    //使用注解的方式创建对象 并且给对象的属性赋值(使用注解配置类 代替xml配置文件)
    @Test
    void configClassMethods() {
       ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
        System.out.println(userService);

    }
}
