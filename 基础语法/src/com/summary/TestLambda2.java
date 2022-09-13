package com.summary;

public class TestLambda2 {

    //静态内部类
    static class Like2 implements ILike2{
        @Override
        public void lamdba() {
            System.out.println("i like lambda2");
        }
    }

    public static void main(String[] args) {
        ILike2 like2 = new Like2();
        like2.lamdba();

    }
}

interface ILike2{
    void lamdba();
}



