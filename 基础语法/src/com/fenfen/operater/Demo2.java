package com.fenfen.operater;

public class Demo2 {
    //多类型运算
    public static void main(String[] args) {
        long a = 1233232L;
        int b =123;
        short c = 11;
        byte d = 8;

        //输出规则：有long就是long，
        System.out.println(a+b+c+d);//long
        System.out.println(b+c+d);//int
        System.out.println(c+d);//int
        System.out.println((double)c+d);//int 一个数为double结果就是double
    }
}
