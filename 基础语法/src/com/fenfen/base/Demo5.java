package com.fenfen.base;

public class Demo5 {
    public static void main(String[] args) {
        int i = 128;
        byte b = (byte)i;

        //优先级：byte-short-char-int-long-float-double

        //类型转换：
        // 从高变低需要强制转换：(类型)变量名
        System.out.println(i);//128
        System.out.println(b);//-128：原因是b最大只有127，你内存溢出了

        //自动转换：从低到高
        double c = i;


        //精度问题
        System.out.println((int)23.7);//原来double转成int：23，精度没了
        System.out.println((int)-45.34F);//原来float转成int：-45。精度没了

        char d = 'a';
        int e = d + 1;
        System.out.println(e);
        System.out.println((char)e);//98在编码中就是b


        /*
        注意点：
        1、不能对布尔进行转换
        2、不能把对象类型转换为不相干的类型
        3、把高容量转到低容量的时候 强制转换
        4、转换的时候可能存在内存溢出，或者精度问题

         */
    }
}
