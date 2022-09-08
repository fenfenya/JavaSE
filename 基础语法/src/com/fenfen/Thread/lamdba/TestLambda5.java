package com.fenfen.Thread.lamdba;

//用lamdba简化
public class TestLambda5 {
    public static void main(String[] args) {
        ILike5 like5= ()->{
            System.out.println("i like lambda5");
        };

        like5.lambda();
    }

}
//1、定义一个函数式接口
interface ILike5 {
    void lambda();

}