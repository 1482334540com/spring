package com.maven.spring.aopanno;

import org.springframework.stereotype.Component;

//被增强类
@Component
public class User {
    public void add(){

        System.out.println("add......");
//        int a = 12/0;
    }

}
