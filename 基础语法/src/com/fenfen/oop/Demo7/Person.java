package com.fenfen.oop.Demo7;

//static静态代码块儿
public class Person {
    {
        //代码块(匿名代码块儿)：在构造器之前，不会自己执行
    }
    static{
        //这个就叫静态代码块儿(匿名代码块)：类一加载就执行
    }

    //例子：

    {
        System.out.println("匿名代码块儿，一般会根据对象每次都跑，所以会被用来赋予初始值");
    }

    static {
        System.out.println("静态代码块儿，这个反而执行的时候是最先的，而且我就跑一次，后面不玩了");
    }
    //构造器

    public Person() {
        System.out.println("构造方法");
    }


    public static void main(String[] args) {

        Person person1 = new Person();
        System.out.println("===============");
        Person person2 = new Person();
    }
}
