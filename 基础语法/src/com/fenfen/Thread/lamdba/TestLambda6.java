package com.fenfen.Thread.lamdba;

//有参数的lamdba
public class TestLambda6 {

    public static void main(String[] args) {
        Love love = new Love();
        love.love(520);
    }

}

interface Ilove{
    void love(int a );
}

class Love implements Ilove{
    @Override
    public void love(int a) {
        System.out.println("i love you-->"+a);
    }
}
