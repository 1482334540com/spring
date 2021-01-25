package com.maven.spring.bean;

public class Dept {

    //部门类
    private  String name;

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Dept{" +
                "name='" + name + '\'' +
                '}';
    }
}
