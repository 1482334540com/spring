package com.maven.spring.bean;

import java.util.List;
//把集合注入类型部分抽取出来
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public  void  init(){
        for (String str: list) {
            System.out.println("List集合中的字符串:"+str);
        }
    }
}
