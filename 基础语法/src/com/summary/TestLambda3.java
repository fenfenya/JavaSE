package com.summary;

public class TestLambda3 {

    public static void main(String[] args) {

        class Like3 implements ILike3{
            @Override
            public void lambda() {
                System.out.println("i like lambda3");
            }
        }
        ILike3 like3 = new Like3();
        like3.lambda();
    }
}
interface ILike3{
    void lambda();
}
