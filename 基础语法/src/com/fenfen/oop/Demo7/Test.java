package com.fenfen.oop.Demo7;

//静态导入包的方法和常量
import static java.lang.Math.random;
import static java.lang.Math.PI;

public class Test {
    public static void main(String[] args) {
        //System.out.println(Math.random());  不想怎么写可以在前面直接导包，但是记得写static
        System.out.println(random());
    }

    /*
    final，如果一个类被final修饰了，那说明是不能被继承了
     */
}
