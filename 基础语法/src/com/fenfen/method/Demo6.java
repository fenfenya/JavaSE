package com.fenfen.method;

public class Demo6 {
    public static void main(String[] args) {
        Demo6 demo6 = new Demo6();
        demo6.test();

    }

    public void test(){
        test();
    }


    //自己调用自己，抛出异常：栈溢出
}
