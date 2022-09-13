package com.fenfen.Thread.lamdba;

//利用静态内部类进行
public class TestLambda2 {

    //利用静态内部类的方式：加上static
    static class Like11 implements ILike1{
        @Override
        public void lambda() {
            System.out.println("i like lambda1");
        }
    }


    public static void main(String[] args) {


        ILike1 like11 = new Like11();
        like11.lambda();
    }

}
        //1、定义一个函数式接口
        interface ILike1 {
            void lambda();

        }

