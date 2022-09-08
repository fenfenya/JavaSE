package com.fenfen.Thread.lamdba;

public class TestLambda1 {

    public static void main(String[] args) {
        Like like = new Like();
        like.lambda();
    }

}


//1、定义一个函数式接口
interface ILike {
    void lambda();

}
//2、实现类
class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }
}



