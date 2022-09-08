package com.fenfen.exception.Demo1;

public class Test0 {
    public static void main(String[] args) {
        try {
            new Test0().test(1,0);
        } catch (ArithmeticException e) {//接收下面排除的异常，捕获一下，保证程序可以正常与运行
            e.printStackTrace();
        }
    }


    //假设这方法中，处理不了这个异常，方法上抛出异常
    public void test(int a, int b) throws ArithmeticException{
        if (b == 0) {//throw
            throw new ArithmeticException();
        }
        System.out.println(a / b);
    }
}