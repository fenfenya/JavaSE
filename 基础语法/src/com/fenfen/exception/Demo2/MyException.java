package com.fenfen.exception.Demo2;

//自定义的异常类：继承Exception类
public class MyException extends Exception{
    //传递数字
    private int detail;
    //整一个构造器：消息构造器
    public MyException(int a) {
        this.detail = a;
    }

    //toString:异常的打印信息
    @Override
    public String toString() {
        //增加一些处理异常的代码块
        return "MyException{"  + detail + '}';
    }
}
