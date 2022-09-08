package com.fenfen.oop.Demo1;

//引用传递：传递的是对象，本质还是值传递
public class Demo5 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);//null

        change(person);
        System.out.println(person.name);//fenfen
    }

    //写个方法
    public static void change(Person person){
        person.name = "fenfen";//原因：引用传递：指针修改，传递的是person的地址，地址不变，地址的内容发生了改变，
                                    // 因为引用指向原对象在内存中的区域，所以可以修改原对象的值

    }
}
//定义了一个Person类，有一个属性：name
class Person{
    String name;
}
