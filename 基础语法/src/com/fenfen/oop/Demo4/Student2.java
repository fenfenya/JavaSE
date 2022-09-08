package com.fenfen.oop.Demo4;

//封装：属性私有 get/set
public class Student2 {
    //名字、姓名、学号：一般封装对于属性来说比较多，对于方法少一些
    //学习、睡觉
    private String name;
    private int id;
    private char sex;
    private int age;

    //提供一些可以操作的这个属性的方法：因为上面private了
    //提供一些public的get、set的方法

    //get获得这个数据
    public String getName() {
        return this.name;
    }

    //set  给这个数据设置值
    public void setName(String name){
        this.name = name;

    }

    //自动生成get/set，右击：generat点击get、set
    public int getAge() {
        return age;
    }


    //甚至可以在set里面写if判断来进行安全性检查
    public void setAge(int age) {
        if (age>120 || age<0) {
            this.age = 3;
        }else{
            this.age = age;
        }
    }



}

/*
封装的意义：
1、提高程序的安全性，保护数据
2、隐藏代码的实现细节
3、统一接口
4、提高系统的可维护性
5、封装和重载会一起经常使用
 */
