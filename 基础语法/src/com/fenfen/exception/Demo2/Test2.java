package com.fenfen.exception.Demo2;

public class Test2 {

    static void test1(int a) throws MyException{
        System.out.println(a);

        if(a>9){
            throw new MyException(a);
        }
        System.out.println("OK");
    }


    public static void main(String[] args) {
        try {
            test1(11);
        } catch (Exception e) {
            System.out.println("MyException=>"+e);
        }
    }
}
