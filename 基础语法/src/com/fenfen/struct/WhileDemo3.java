package com.fenfen.struct;

public class WhileDemo3 {
    public static void main(String[] args) {
        //计算1+2+3+...+100

        int i =0;
        int sum = 0;
        while (i<=100){
            sum =sum+i;
            i = i+1;

        }
        System.out.println(sum);
    }
}
