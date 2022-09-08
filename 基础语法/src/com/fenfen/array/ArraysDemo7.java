package com.fenfen.array;

import java.util.Arrays;

public class ArraysDemo7 {

    public static void main(String[] args) {
        int[] a = {1,4,5,6,72,2,2,25,6,7};

        int[] sort = sort(a);//调用玩玩，返回的新的数组就是排序后的数组
        System.out.println(Arrays.toString(sort));


    }


    public static int[] sort(int[] array) {

        //临时变量
        int temp = 0;

        //外层循环，判断我们这个要走多少次,-1是因为两两比较
        for (int i = 0; i < array.length - 1; i++) {

            boolean flag = false;//通过flag标识减少没有意义的比较

            //内存循环，比较判断两个数，如果第一个数，比第二个数大，则交换位置,每一轮总能找出一个最小数
            for (int j = 0; j < array.length - 1-i; j++) {
                if (array[j] > array[j+1]) {

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    flag = true;
                }
            }

            if(flag==false){//没有交换为false，那就结束了，退出即可
                break;
            }
        }
        return array;
    }

}
