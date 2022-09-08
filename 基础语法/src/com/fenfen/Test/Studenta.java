package com.fenfen.Test;

public class Studenta {
    String name;
    int age;

    public void study(){
        System.out.println(this.name+"学习");
    }
}

class Application{
    public static void main(String[] args) {
        Studenta xiaoming = new Studenta();
        xiaoming.name = "小明";
        //xiaoming.study();


        //走无参构造器
        Person person = new Person();
        System.out.println(person.name);

        //走有参构造器
        Person persona = new Person("yeuyue","女");
    }
}
class Person{
    String name;
    String sex;

    public Person() {
        this.name = "手写显性构造器实例化初始值";
    }

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}











