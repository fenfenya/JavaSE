package com.fenfen.oop.Demo2;

//java --->编译后生成 class：在Project Structure，module中添加out目录，而后打开out.class文件
public class Person {

    String name;
    String sex;


    //1、一个类即使什么都不写，也会存在构造方法，即构造器：无参构造器
    //构造器的作用：实例化初始值：使用new对象，本质是在调用构造器
    public Person(){
        this.name = "fenfen";
    }

    //2、有参构造器:一旦定义了有参构造，无参就必须显示定义

    public Person(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }


    //3、快捷键生成构造器：alt+insert：constructor


    /*
    构造方法要求：
    1、和类名相同
    2、没有返回值
    作用：
    1、new 本质在调用构造方法
    2、初始化对象
    注意点：
    1、定义了有参构造之后如果像使用无参，需要显示定义一个无参的构造
     */

}
