package com.fenfen.struct;

public class DoWhileDemo1 {
    public static void main(String[] args) {
        int i =0;
        int sum = 0;

        do{
            sum =sum + i;
            i = i+1;
        }while(i<=100);

        System.out.println(sum);
    }
}
