package com.maven.spring.bean;

public class User {
    private  String id;
    private  String username;
    private  Integer money;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public User() {
    }

    public User(String id, String username, Integer money) {
        this.id = id;
        this.username = username;
        this.money = money;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", money=" + money +
                '}';
    }
}
