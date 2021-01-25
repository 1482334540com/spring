package com.maven.spring.bean;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.beancontext.BeanContext;

class UserTest {

//通过xml配置创建对象
    @Test
    void doMethods() {
        //加载spring配置文件的时候创建就对象
//        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        //加载配置文件时候不会创建对象，在获取对象（使用）才去创建对象
        BeanFactory context = new ClassPathXmlApplicationContext("bean.xml");

        User user = (User)context.getBean("user");
        user.doMethods();
    }
 //基于xml 通过constructor方法给对象属性赋值
    @Test
    void  doMethodsXmlConstructor() {
        //加载spring配置文件的时候创建就对象
        BeanFactory context = new ClassPathXmlApplicationContext("bean.xml");
        Book book = (Book)context.getBean("book");
        System.out.println(book);

    }
// 基于xml通过set方法给对象赋值
    @Test
    void doMethodsXmlSet() {
        //加载spring配置文件的时候创建就对象
        BeanFactory context = new ClassPathXmlApplicationContext("bean.xml");
        Order order = (Order)context.getBean("order");
        System.out.println(order);

    }

}
