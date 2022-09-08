package com.fenfen.Scanner;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        //从键盘接收数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("使用nextline方式接收：");

        if(scanner.hasNext()==true){ //判断是否还是输入
            String str = scanner.nextLine();
            System.out.println("输入的内容为："+str);
        }


        //用完还是记得关闭
        scanner.close();



   /* 总结一下：
            next和nextLine的区别：next以空白结束符，nextLine以回车为结束符
            例如：我打1 2 3，next只会输出1，nextLine就会输出1 2 3
             */
    }
}
