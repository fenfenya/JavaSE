package com.summary;

public class TestLambda1{

    public static void main(String[] args) {
        ILike like = new Like();//父类的引用指向子类的对象
        like.lambda();
    }
}


//函数式接口：只有一个方法的接口
interface ILike{
    void lambda();
}

//实现类
class Like implements ILike{
    @Override
    public void lambda() {
        System.out.println("i like lambda");
    }
}