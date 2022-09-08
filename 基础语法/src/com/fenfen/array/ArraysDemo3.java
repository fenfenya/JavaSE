package com.fenfen.array;

public class ArraysDemo3 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //打印全部的数组元素
        for (int i = 0; i < arrays.length; i++) {
            System.out.println(arrays[i]);
            
        }
        System.out.println("=============");

        //计算所有元素的总和
         int sum = 0;
        for (int i = 0; i < arrays.length;i++) {
            sum =sum + arrays[i];
        }
        System.out.println(sum);

        //查找最大元素
        int result = arrays[0];
        for (int i = 1; i < arrays.length; i++) {
            if(arrays[i]>result){
                result = arrays[i];
            }
        }
        System.out.println(result);

    }
}
