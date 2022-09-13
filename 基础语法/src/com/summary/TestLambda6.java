package com.summary;

public class TestLambda6 {

    public static void main(String[] args) {

        Ilove ilove = (a,b) -> {
            System.out.println("i love you "+a+" "+b);
        };

        ilove.love(520,1314);

    }

}

interface Ilove{
    void love(int a,int b);
}
