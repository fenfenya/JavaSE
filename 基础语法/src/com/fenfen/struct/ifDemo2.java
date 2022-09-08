package com.fenfen.struct;

import java.util.Scanner;

public class ifDemo2 {

//if的双选择结构
    public static void main(String[] args) {
        //考试分数大于60是及格，小于60不及格
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");

        int score = scanner.nextInt();

        if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

        scanner.close();
    }
}
