package com.fenfen.oop.Demo1;

public class Demo2 {
    public static void main(String[] args) {
        //在方法非静态下：实例化这个类
        //对象类型 对象名 = 对象值
        Student student = new Student();
        student.say();
    }



    //static和类(class：Demo2)一起加载
    public static void a(){
        //b();//会报错
    }
    //没有static：这个得等到类实例化(new 后)才存在
    public void b(){
        a();
    }


}



