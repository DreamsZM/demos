package com.zy.demos;

import com.sun.corba.se.impl.interceptors.PICurrent;

import java.util.Date;

public class Main {
    public static final String DEFAULT = "TEST";
    public static final String TAG = "TAG";
    public static final int ONE = 1;

    /**
    * 年龄
    */
    private int age;

    /**
    * name
    */
    private int name;

    /**
    * 年龄
    */
    private String name1;
    
    private int age1;
    
    private String name3;

    public static void main(String[] args) {
        new User("zhaomin");
        for (int i = 0; i < 100; i++) {
            System.out.println(new Date());
        }
    }

    public User getUser(){
        User user = new User("shan");

        return user;
    }

    public void valid(User user){
        if (user != null) {

        }
    }


    





}
