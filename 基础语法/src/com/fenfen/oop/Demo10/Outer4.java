package com.fenfen.oop.Demo10;

public class Outer4 {

    public static void main(String[] args) {

        //一般是Apple apple = new Apple();
        //也可以是：没有名字初始类，不用将实例保存到变量中
        new Apple().eat();

        //接口重写下方法
      new UserService()
        //实际写全是：UserService userService = new UserService()
        {

            @Override
            public void hello() {

            }
        };
    }
}

class Apple{
    public void eat(){
        System.out.println("1");
    }
}
//整一个接口
interface UserService{
    void hello();

}
