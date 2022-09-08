package com.fenfen.Scanner;

import java.util.Scanner;
//scanner的进阶用法
public class Demo4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //从键盘接收数据
        int i = 0;
        float f = 0.0f;

        System.out.println("请输入整数：");
        //如果...那么
        if(scanner.hasNextInt()==true){

            i = scanner.nextInt();
            System.out.println("整数数据："+i);
        }else{
            System.out.println("你输入的不是整数数据");
        }

        System.out.println("请输入小数：");
        if(scanner.hasNextFloat()==true){

            f = scanner.nextFloat();
            System.out.println("小数数据："+f);
        }else{
            System.out.println("你输入的不是小数数据");
        }

        scanner.close();
    }



    /*
    总结下：
    ①new下scanner
    ②定义下属性
    ③两个判断：用上scanner.hasNextInt/scanner.hasNextFloat()方法
    ④if中：接收下，用上scanner.nextInt()/scanner.nextFloat()方法
    ⑤if...else
    ⑥关闭
     */
}
