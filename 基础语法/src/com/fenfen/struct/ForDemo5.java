package com.fenfen.struct;

public class ForDemo5 {
    //for在数组和集合中的遍历
    public static void main(String[] args) {
        //①普通写法
        int[] numbers = {10,20,30,40,50};//定义了一个数组


        for (int i =0;i<5;i++){
            System.out.println(numbers[i]);
        }
        System.out.println("========================");

        //②指针抽象一点的写法：遍历数组中的元素
        for (int x:numbers){//x是内置的一个指针
            System.out.println(x);
        }
    }
}
