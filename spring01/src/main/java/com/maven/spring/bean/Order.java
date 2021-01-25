package com.maven.spring.bean;

public class Order {

    private  String orderId;
    private  String price;


    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
