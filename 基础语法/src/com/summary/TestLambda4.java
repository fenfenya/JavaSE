package com.summary;

public class TestLambda4 {


    public static void main(String[] args) {

       ILike4 like = new ILike4(){//你他妈直接去new 接口了呀
            @Override
            public void lambda() {
                System.out.println("i like lambda4");
            }
        };
       like.lambda();

    }

}


interface ILike4{
    void lambda();
}
