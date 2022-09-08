package com.fenfen.array;

import java.util.Arrays;

public class ArraysDemo6 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 9009, 31231, 679, 56, 32, 65, 645};
        System.out.println(a);//打印出来是哈希code

        //1、打印数组元素（用类下面的toString
        System.out.println(Arrays.toString(a));

        //2、用自己造的方法打印
        printArray(a);

        //3、排序
        Arrays.sort(a);//对数组进行排序：升序
        System.out.println("排序后是："+Arrays.toString(a));

        //4、赋值,全部填充成0
        Arrays.fill(a,0);
        System.out.println(Arrays.toString(a));

    }

    //  2、也可以自己写个方法打印，不过idea就有，建议不要重新造轮子
    public static void printArray(int[] a) {
        //System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            if (i == a.length - 1) {
                System.out.print(a[i] + "]");
            } else {
                System.out.print(a[i] + ",");
                //System.out.print(a[i]+",");//要[]或者可以直接放循环外
            }
            //System.out.println("]");
        }
    }
}
