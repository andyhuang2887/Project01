package com.hza.baen;

public class Customer extends Person{
    public static void main(String[] args) {
        System.out.println("hello world !!!");
    }

    @Override
    public void eat() {
        System.out.println("客户吃饭");
    }
}
