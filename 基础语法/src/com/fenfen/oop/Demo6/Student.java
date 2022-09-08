package com.fenfen.oop.Demo6;

public class Student extends Person{
    //重写下父类的方法


    @Override
    public void run() {
        System.out.println("son");
    }

    public void eat(){
        System.out.println("eat");
    }



    public void go(){
        System.out.println("go");
    }
}
