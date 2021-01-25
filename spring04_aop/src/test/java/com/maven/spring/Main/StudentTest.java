package com.maven.spring.Main;


import com.maven.spring.aopanno.AopConfig;
import com.maven.spring.aopanno.Book;
import com.maven.spring.aopanno.User;
import com.maven.spring.dao.Impl.UserDaoImpl;
import com.maven.spring.dao.UserDao;
import com.maven.spring.proxy.MyUserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

class StudentTest {

    //jdk动态代理
    @Test
    void jdkProxyMethods() {

        UserDaoImpl userDao = new UserDaoImpl();

        InvocationHandler handler =  new MyUserDao(userDao);

        UserDao proxy = (UserDao) Proxy.newProxyInstance(UserDaoImpl.class.getClassLoader(), userDao.getClass().getInterfaces(), handler);

        int sum = proxy.add(5, 5);
        System.out.println(sum);

    }

    //AOP 操作（AspectJ 注解）1
    @Test
    void aopAnnotationMethods1() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user", User.class);
        user.add();

    }
    //AOP 操作（AspectJ 注解）2 完全注解开发
    @Test
    void aopAnnotationMethods2() {

        ApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        User user = context.getBean("user", User.class);
        user.add();

    }
    //AOP 操作（AspectJ 注解）3 xml配置开发
    @Test
    void aopAnnotationMethods3() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book = context.getBean("book", Book.class);
        book.buy();
    }
    
}
