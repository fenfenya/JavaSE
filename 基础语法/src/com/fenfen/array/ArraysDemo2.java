package com.fenfen.array;

public class ArraysDemo2 {
    public static void main(String[] args) {
        //静态初始化：之前的是new的初始化
        //可以理解为：创建和赋值一起

        int[] a = {1,2,3,4};

        for (int i = 0; i < a.length; i++) {//这边不能等于,不然会数组越界
            System.out.println(a[i]);
            
        }

        //引用类型的数组
        Man[] mans = {new Man(),new Man()};

        //动态初始化:包含默认初始化（没赋值也有变量值
        int[] b =new int[10];
        b[0] = 10;
        System.out.println(b[0]);
        System.out.println(b[1]);//也是有值的，默认初始化为0


        System.out.println(a[0]);
    }
}
