package com.maven.spring.dao;


public interface UserDao {
    /**
     *  实现两个数相加
     * @param a 参数1
     * @param b 参数2
     * @return 返回两个数相加得到和
     */
    public  int add(int a,int b);

    public String update(String id);
}
