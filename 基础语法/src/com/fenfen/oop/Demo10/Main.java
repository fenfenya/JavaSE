package com.fenfen.oop.Demo10;

public class Main {
    public static void main(String[] args) {
        //new
        Outer outer = new Outer();

        //通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();//outer.new Inner();
        inner.in();
        inner.getID();
    }
}
