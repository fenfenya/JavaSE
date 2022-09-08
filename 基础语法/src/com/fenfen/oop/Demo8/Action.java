package com.fenfen.oop.Demo8;

//abstract抽象类：类是要被继承得，但是继承是指单继承，但是接口可以实现多继承，所以呢，引出下一节课要用的东西即可

public abstract class Action {

    //约束
    //abstrct ,抽象方法，只有方法名字，没有具体的方法内容实现，并且抽象方法跟抽象类
    public abstract void doSomething();



    /*
    1、不能在这个抽象类new(在main中都不给new，只能靠子类去实现它（重写？
    2、抽象类中可以写普通的方法
    3、抽象方法必须在抽象类中
    抽象的抽象：约束

    抽象存在的意义：例如游戏中，抽象出一定的内容，每创建一个角色就去继承这个抽象类，直接重写部分方法，改掉一些不必要的东西即可

     */
}
