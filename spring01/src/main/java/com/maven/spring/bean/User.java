package com.maven.spring.bean;

public class User {
    private  String userName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
        System.out.println("user的无参构造方法被调用了");
    }

    public  void  doMethods(){

        System.out.println("doMethods方法被调用了");
    }

}
