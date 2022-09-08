package com.fenfen.exception.Demo2;

public class Test {
    //可能会存在异常的方法

    static void test(int a) throws MyException {

        System.out.println("传递的参数为："+a);

        if(a>10){
            //throw new MyException(a);到这边有两种选择，一个捕获，一个抛出去
            throw new MyException(a);//这边选择抛出
        }

        System.out.println("OK");

    }

    public static void main(String[] args) {
        //记得用try，catch捕获一下
        try {
            test(11);
        } catch (MyException e) {//接收抛出的异常
            System.out.println("MyException=>"+e);
        }
    }
}
