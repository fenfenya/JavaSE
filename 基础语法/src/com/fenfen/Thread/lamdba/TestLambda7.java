package com.fenfen.Thread.lamdba;

public class TestLambda7 {

    public static void main(String[] args) {

        Ilove1 ilove1 = new Ilove1(){//记得改成接口的类
            @Override
            public void love(int a) {
                System.out.println("i love life-->"+a);
            }
        };
        ilove1.love(888);
    }

}

interface Ilove1{
    void love(int a );
}


