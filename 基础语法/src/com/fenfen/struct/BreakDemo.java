package com.fenfen.struct;

public class BreakDemo {
    public static void main(String[] args) {

        int i =0;
        while(i<100) {
            i++;
            System.out.println(i);
            if (i == 30) {
                break;//30后面就不干了，跳出这个循环
            }
        }

        System.out.println("123");

    }
}
