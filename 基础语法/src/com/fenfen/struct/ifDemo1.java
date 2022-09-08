package com.fenfen.struct;

import java.util.Scanner;

//if单选择结构
public class ifDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输内容：");
        String s = scanner.nextLine();

        //equals：判断字符串是否相等,不用"="
        if(s.equals("Hello")){
            System.out.println(s);
        }

        System.out.println("End");
        scanner.close();
    }
}
