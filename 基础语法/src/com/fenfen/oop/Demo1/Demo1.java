package com.fenfen.oop.Demo1;

public class Demo1 {
    public static void main(String[] args) {
        sayHello();
    }


    /*
    修饰符 返回值类型 方法名()
     */
    public static String sayHello(){
        return "hello,world";//return表示方法结束
    }

    public void hello(){
        return;//可以写return
    }

    public static int max(int a,int b){
        return a>b ? a:b;
    }
}
