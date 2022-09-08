package com.fenfen.struct;

import java.util.Scanner;
//if多选择结构
public class ifDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩：");

        int score = scanner.nextInt();

        if(score==100){
            System.out.println("恭喜，是满分！");

        }else if (score <100 && score >= 90){
            System.out.println("A");
        }else if (score <90 && score >= 80){
            System.out.println("B");
        }else if (score <80 && score >= 70){
            System.out.println("C");
        }else if (score <70 && score >= 60){
            System.out.println("D");
        }else if (score <60 && score >= 0){
            System.out.println("A");
        } else {
            System.out.println("成绩不合法");
        }

    /*
    1、分数的不在0-100的也要考虑，为不合法，写程序的时候就要想到所有的情况，不然后续修改bug很麻烦
    2、只要满足了一个else if，其他的else if就不执行了
     */

        scanner.close();

    }
}
