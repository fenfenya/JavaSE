package com.fenfen.Thread.lamdba;

//局部内部类
public class TestLambda3 {


    public static void main(String[] args) {

        class Like3 implements ILike3{
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }
        Like3 like3 = new Like3();
        like3.lambda();
    }

}
//1、定义一个函数式接口
interface ILike3 {
    void lambda();

}

