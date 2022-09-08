package com.fenfen.Test;

public class B {
    public void test(){
        System.out.println("B=>test");
    }

}


 class A extends B{

     @Override
     public void test() {
         System.out.println("A=>test");
     }
 }


class Applicationc{
    public static void main(String[] args) {
        B b = new A();
        b.test();//A=>test
    }
}


