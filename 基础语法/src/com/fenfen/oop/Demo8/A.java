package com.fenfen.oop.Demo8;

public class A extends Action{
    //继承用了abstract的类会报错，必须得重写一下才可以
    //抽象类得所有方法，继承了他的子类，都必须要实现他的方法
    @Override
    public void doSomething() {
    }
}
