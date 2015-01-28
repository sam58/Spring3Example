package com.sam58.tests;

/**
 * Created by sam158 on 28.01.2015
 * spring bean.
 */
public class HelloWorld {
    private String name;

    public void setName(String name){
        this.name =name;
    }

    public void printHello(){
        System.out.printf("Hello, %s",name);
    }

}
