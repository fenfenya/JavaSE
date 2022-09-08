package com.fenfen.oop.Demo5;

//人:父类
public class Person {

    //整一个无参构造器
    public Person(){
        System.out.println("Person无参执行了");
    }

    public int money = 10_0000_0000;

    private int money2 = 99999999;

    public void say(){
        System.out.println("说了一句话");
    }


    //get和set方法针对private搞个封装
    public int getMoney2() {
        return money2;
    }

    public void setMoney2(int money2) {
        this.money2 = money2;
    }

    //protected
    protected String name = "fenfen父类";

    //如果是私有的，就继承不了了
    public void print(){
        System.out.println("Person");
    }
}
