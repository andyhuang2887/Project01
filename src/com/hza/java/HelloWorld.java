package com.hza.java;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {

    private static int num;

    public HelloWorld() {
    }

    private static final int INITIAL_SIZE = 10;

    public static void main(String[] args) {
        //region Description
        ArrayList list2 = getArrayList();
        System.out.println(list2);
    }

    private static ArrayList getArrayList() {
        System.out.println("hello world !");
        System.out.println("hello world !");
        ArrayList list2 = new ArrayList();
        //endregion

        /*ArrayList list1 = null;
        synchronized ()*/
        Date date = new Date();
        list2.add(1, 123);
        return list2;
    }

    public static void method1() {
        num = 10;
        try {
            FileInputStream fis = new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
