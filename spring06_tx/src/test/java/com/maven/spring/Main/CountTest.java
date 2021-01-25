package com.maven.spring.Main;


import com.maven.spring.config.TxConfig;
import com.maven.spring.service.UserDaoService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

class CountTest {


    @Test
    void accountMoney() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        UserDaoService userDaoService = context.getBean("userDaoService", UserDaoService.class);
        userDaoService.accountMoney();

    }
//xml配置事务管理
    @Test
    void accountMoneyXml() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserDaoService userDaoService = context.getBean("userDaoService", UserDaoService.class);
        userDaoService.accountMoney();

    }
//纯注解事务管理
    @Test
    void accountMoneyAnnotations() {

        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserDaoService userDaoService = context.getBean("userDaoService", UserDaoService.class);
        userDaoService.accountMoney();

    }



}
