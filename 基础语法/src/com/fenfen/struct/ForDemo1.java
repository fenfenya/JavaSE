package com.fenfen.struct;

public class ForDemo1 {
    public static void main(String[] args) {
        int a = 1;//初始化条件

        while(a<100){//条件判断
            System.out.println(a);//循环体
            a+=2;//迭代
        }
        System.out.println("while循环结束");

        //for (初始值，布尔值，更新),即初始化、条件判断、迭代
        for(int i = 1;i<100;i++){
            System.out.println(i);

        }



        //100.for快捷键
        for (int i = 0; i < 100; i++) {

        //死循环
        for(;;){

        }
        }



        System.out.println("for循环结束");


    }


}
