package com.fenfen.Thread.lamdba;

public class TestLambda8 {

    public static void main(String[] args) {

        Ilove2 ilove2 = (int a)-> {
                System.out.println("i love life-->"+a);
            };

        //再简化：①去掉参数类型
        ilove2 = (a)-> {
            System.out.println("i love life-->"+a);
        };

        //再简化：把括号(),{}都简化没了
        ilove2 = a->
            System.out.println("i love life-->"+a);

        ilove2.love(886);

        //总结：
        //lamdba表达式只能有一行代码的情况下才能简化成为一行，如果多行就用上代码块的花括号
        //必须前提是函数式接口：就一个方法
    }

}
interface Ilove2{
    void love(int a );
}
