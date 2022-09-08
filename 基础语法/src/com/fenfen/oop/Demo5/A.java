package com.fenfen.oop.Demo5;

public class A extends B{
    //重写1:右击有override methods
    @Override//把static去掉，这个就是注解：有功能的注释
    public void test() {
        System.out.println("A=>test");
    }

    //public static void test() {
        //System.out.println("A=>test");


    }

