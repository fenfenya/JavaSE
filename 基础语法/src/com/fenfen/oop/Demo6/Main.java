package com.fenfen.oop.Demo6;

import javax.swing.text.TabExpander;

public class Main {
    public static void main(String[] args) {
        //一个对象的实际类型是确定的
        //new Student();
        //new Person();

        //可以指向的引用类型就不确定了
        Student s1 = new Student();//Student能调用的方法都是自己或者是继承来的
        //①父类的引用指向子类的类型
        Person s2 = new Student();//父类的可以指向子类，但是不能调用子类特定的方法
        //②指向Object
        Object s3 = new Student();


        //调用方法看看
        s2.run();//子类重写了父类的方法，因此父类的方法调用的时候变成子类了
        s1.run();
        s1.eat();


        //对象能执行哪一些方法，主要看对象左边的类型，和右边关系不大
        //s2.eat();这样掉用肯定有错误,原因：/父类的可以指向子类，但是不能调用子类特定的方法
        ((Student)s2).eat();//强制转换（高类型转成
    }

    /*
    多态注意事项：
    1、多态是方法的多态，属性没有多态
    2、父类和子类，有联系   如不符合：会出现异常ClassCastException！
    3、存在条件：①继承关系②方法需要重写③父类引用指向子类对象 Father f1 = new Student();
       有些方法不能重写：
       ①static静态，修饰的方法，属于类，不属于实例
       ②final常量，修饰的
       ③private方法：
    */

    /*
    多态是可以动态编译的，可以实现可扩展性
     */
}
