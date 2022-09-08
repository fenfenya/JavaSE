package com.fenfen.method;

public class Demo4 {
    public static void main(String[] args) {
        //可变参数可以理解为：不知道需要传入多少参数而设置的，可以避免方法的多次重载
        Demo4 demo4 = new Demo4();
        demo4.test(1,2,3,4,5);

        /*
        下面的方法没有static，如果有直接：
        test(1,2,3,4,5);
         */

    }

    //用...表示可以有很多参数（可变参数，并且其他参数必须放在最前面
    public void test(int x,int... i){
        System.out.println(i[2]);
        System.out.println(x);

    }
}
