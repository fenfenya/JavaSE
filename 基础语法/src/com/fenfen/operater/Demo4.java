package com.fenfen.operater;

public class Demo4 {
    public static void main(String[] args) {
        //++,--  自增，自减   一元运算符
        int a = 3;
        int b =a++;//先赋值再加
        //a++ a=a+1
        System.out.println(b);//b = 3
        System.out.println(a);//a = 4

        int c = ++a;  //先加再赋值

        System.out.println(c);//c = 5
        System.out.println(a);//a = 5


        //幂运算,用到数学类 ，很多运算，我们会使用一些工具类来操作
        double pow = Math.pow(3,2);//3的2次方
        System.out.println(pow);
    }
}
