package com.fenfen.struct;

public class DoWhileDemo2 {
    public static void main(String[] args) {
        //用while
        int a = 0;
        while(a<0){
            System.out.println(a);
            a++;
        }
        System.out.println("=======================");

        //用dowhile
        do{
            System.out.println(a);
            a++;
        }while(a<0);



    }
}
