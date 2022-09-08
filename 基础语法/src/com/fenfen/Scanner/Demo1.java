package com.fenfen.Scanner;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {
        //创建一个扫描器对象，用于接受键盘数据
        Scanner scanner = new Scanner(System.in);//new Scanner(System.in);alt+enter
        System.out.println("使用next方式接收：");

        //判断用户有没有字符串输入字符串
        if(scanner.hasNext()==true){
            //使用next方式接收
            String str = scanner.next();//程序会一直等待用户输入
            System.out.println("输入的内容为："+str);
        }

        //最后记得关闭scanner,凡是属于io流的类如果不关闭会一直占用资源，要养成好习惯用完就关闭
        scanner.close();

    }
}
