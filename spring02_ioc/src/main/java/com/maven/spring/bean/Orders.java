package com.maven.spring.bean;

public class Orders {
    private String name;

    public void setName(String name) {
        System.out.println("2:掉用set方法,赋值");
        this.name = name;
    }

    public Orders() {
        System.out.println("1:执行无参构造方法,创建对象");
    }

    //创建执行的初始化方法
    public  void initMethod(){
        System.out.println("4:创建执行的初始化方法");
    }

    public  void  destroyMethod(){
        System.out.println("7:销毁创建出来的bean对象");
    }
}
