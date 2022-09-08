package com.fenfen.Thread.lamdba;

public class TestLambda9 {

    public static void main(String[] args) {

        Ilove3 ilove3 = null;

        ilove3 = (a,b)->
            System.out.println("i love you-->"+a+" "+b);

        ilove3.love(520,1314);
        /*
        多个参数也可以去掉参数类型，要去掉就全部去掉，并且带上括号
         */

    }

}
interface Ilove3{
    void love(int a,int b );
}
