package com.fenfen.oop.Demo2;

import javax.swing.text.Style;

//学生类
public class Student {
    //属性：字段
    String name;//未赋任何值，默认初始化为null
    int age;//为赋任何值，初始化为0

    //方法
    public void study(){
        System.out.println(this.name+"学生在学习");//this表示当前这个类
    }
}
