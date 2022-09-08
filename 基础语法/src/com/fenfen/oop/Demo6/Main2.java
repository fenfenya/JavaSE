package com.fenfen.oop.Demo6;

public class Main2 {
    public static void main(String[] args) {
        //Object > String
        //Object > Person > Student
        //Object > Person > Teacher

        Object student2 = new Student();
        //instanceof判断左边对象是否是右边类的一个实例
        System.out.println(student2 instanceof Student);//看看是不是Student类型呢true
        System.out.println(student2 instanceof Person);//看看是不是Student类型呢true
        System.out.println(student2 instanceof Object);//看看是不是Student类型呢true
        System.out.println(student2 instanceof Teacher);//看看是不是Student类型呢false     因为没有new：object和Teacher
        System.out.println(student2 instanceof String);//看看是不是Student类型呢false
        System.out.println("==============================================================");


        Person person = new Student();

        System.out.println(person instanceof Student);//true
        System.out.println(person instanceof Person);//true
        System.out.println(person instanceof Object);//true
        System.out.println(person instanceof Teacher);//false
        //System.out.println(person instanceof String);//编译报错！
        System.out.println("==============================================================");

        Student student = new Student();

        System.out.println(student instanceof Student);//true
        System.out.println(student instanceof Person);//true
        System.out.println(student instanceof Object);//true
        //System.out.println(student instanceof Teacher);//编译报错
        //System.out.println(person instanceof String);//编译报错


        /*
        总结一波：
        System.out.println(X instanceof Y);能不能编译通过取决于X、Y有没有父子关系
         */




    }
}
