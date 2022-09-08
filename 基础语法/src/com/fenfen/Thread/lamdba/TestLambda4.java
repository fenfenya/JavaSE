package com.fenfen.Thread.lamdba;

public class TestLambda4 {

    public static void main(String[] args) {

        ILike4 like4 = new ILike4(){
        @Override
        public void lambda() {
            System.out.println("i like lambda4");
        }
    };//记得有分号
        like4.lambda();
    }

}
//1、定义一个函数式接口
interface ILike4 {
    void lambda();

}

