package com.maven.spring.bean;

public class Emp {
    //员工类
    private String name;
    private String  sex;

    //员工表示某一个部门 使用对象形式表示
    private  Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void init(){
        System.out.println(name+","+sex+","+dept);
    }
}
