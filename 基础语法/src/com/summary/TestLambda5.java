package com.summary;

public class TestLambda5 {

    public static void main(String[] args) {
        ILike5 like5 = () -> {
            System.out.println("i like lambda5");
        };

        like5.lambda();


        ILike6 like6 = () -> {
            System.out.println("i like lambda6");
        };

        like6.lambda1();


    }
}



interface ILike5{
    void lambda();
}

interface ILike6{
    void lambda1();
}