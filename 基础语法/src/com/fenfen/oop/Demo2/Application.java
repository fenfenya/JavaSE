package com.fenfen.oop.Demo2;

import com.fenfen.oop.Demo3.Pet;
import com.fenfen.oop.Demo4.Student2;

import java.sql.SQLOutput;

//一个项目应该只存在一个main方法
public class Application {

    public static void main(String[] args) {

//1、对应着Student的代码
        //类：抽象的，需要实例化
        //类实例化后会返回一个自己的对象！
        //Student对象就是一个Student类的具体实例
        Student student = new Student();
        Student xiaoming = new Student();
        Student xiaohong = new Student();

        //赋值：
        xiaoming.name = "小明";
        xiaoming.age = 3;

        //打印赋值后的对象属性：未赋值出来是null和0
        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

    //2、对应了Person的代码
        //实例化了一个对象：走的无参构造器
        Person person = new Person();
        System.out.println(person.name);

        //走有参构造器
        Person person1 = new Person("fenfen","女");
        System.out.println(person1.name);

    //3、对应了Pet的代码
        Pet dog = new Pet();
        dog.name = "旺财";
        dog.age =3;
        dog.shout();

        System.out.println(dog.name);
        System.out.println(dog.age);


    //4、对应Student2的代码
        Student2 s1 = new Student2();
        //s1.name = "fenfen";私有的不可调用
        String name = s1.getName();//get
        s1.setName("ffenfen");
        System.out.println(s1.getName());//s1.getName().sout

        s1.setAge(999);
        System.out.println(s1.getAge());


    //5、对应子类父类Demo5的Student和Teacher
        com.fenfen.oop.Demo5.Student student1 = new com.fenfen.oop.Demo5.Student();
        student1.test("fenfenmain类");
        student1.test1();


    //6、检验子类、父类的Demo5的Student和Teacher的无参构造
        Student student2 = new Student();
        //内容详见笔记和图




    }
}
