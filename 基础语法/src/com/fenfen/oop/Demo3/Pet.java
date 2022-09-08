package com.fenfen.oop.Demo3;

public class Pet {
    public String name;
    public int age;

    public void shout(){
        System.out.println("叫了一声");

    }

    /*简单小结类与对象
    1、类与对象
        类是一个模板：抽象，对象是一个具体的实例
    2、方法
        定义、调用
    3、对象的引用
        引用类型：基本类型（8大基本类型
        对象是通过引用来操作的：栈---->堆(地址)
    4、属性：字段field成员变量
        默认初始化
            数字：0   0.0
            char：u0000
            boolean：false
            其他引用：null

            修饰符 属性类型 属性名 = 属性值！
     5、对象的创建和使用
        必须使用new关键字创建对象  要要有构造器 Person fenfen = new Person(;
        对象的属性：fenfen.name
        对象的方法：fenfen.sleep()

     6、类：
        静态属性：属性
        动态行为：方法


     */
}
