package com.fenfen.method;

public class Demo1 {

    //main方法
    public static void main(String[] args) {
        //直接调用：这边的参数叫实参，实参可以传递给到形参
        int sum = add(1, 2);
        System.out.println(sum);


        //调用test方法
        test();


    }

    //加法：这边add的参数叫形式参数，形参可以随便写啥
    public static int add(int a,int b){
        //a+b就是方法体
        return a+b;

    }

    public static void test(){//void表示返回为空

        for (int i = 0; i <= 1000; i++) {
            if (i % 5 == 0) {
                System.out.print(i + "\t");
            }

            if (i % (5 * 3) == 0) {
                System.out.print("\n");//或者System.out.println();
            }
        }
    }

    /*
    方法包含：
        修饰符、返回值类型、方法名、参数类型、方法名(参数类型 参数名){
        }
     */
}
