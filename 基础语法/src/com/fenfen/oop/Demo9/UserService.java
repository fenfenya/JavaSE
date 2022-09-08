package com.fenfen.oop.Demo9;

//接口：用interface
// 写简单方法，然后有一个对应实现类UserServiceimp
public interface UserService {

    //public void run(){   此处需要加上abstract不然不给写方法

    //}

    //接口中的所有定义其实都是抽象的 public abstract的方法
    public abstract void run();

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);


    //接口中定义属性：就是一个常量,很少在接口中定义常量：默认public static final
    public static final int AGE = 99;


}
