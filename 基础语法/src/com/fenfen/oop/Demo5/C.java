package com.fenfen.oop.Demo5;
//方法的重写
public class C {
    public static void main(String[] args) {

        //方法的调用只和左边的类型有关，定义的数据类型有关
        /*第二次用重写的没有static的结果截然不同：
        有static静态时：b调用的是B类的方法，因为b是用B类去定义的
        没有static静态时：b调用的是对象的方法，b是用A类new的
         */
        A a = new A();
        a.test();//走的是A类的方法

        //A继承B，父类的引用指向子类
        //没用static(非静态才叫重写)：子类重写了父类的方法
        B b = new A();
        b.test();//走的B类的方法
    }



}
