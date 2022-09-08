package com.fenfen.array;

public class ArrayDemo1 {
    //变量的类型  变量的名字 =  变量的值；
    //声明
    public static void main(String[] args) {

        //定义,第一种首选
        int[] nums;
        int nums2[];

        //创建
         nums = new int[10];



        //赋值
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;

        //取值
        System.out.println(nums[2]);
        System.out.println(nums[10]);//这样下边就越界啦，会报错：数组下标越界：ArrayIndexOutOfBoundsException

        //计算所有元素的和:获取数组长度用arrays.length
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum = sum+nums[i];

        }
        System.out.println(sum);


        /*
        声明在堆里面，new好了在栈里面开辟空间，赋值是往里面空间里面放值
         */
    }
}
