package com.fenfen.struct;

public class ContinueDemo {
    public static void main(String[] args) {
        int i =0;
        while (i<100){
            i++;
            if(i%10==0){
                System.out.println();
                continue;//立马会跳到循环最开始的地方，终止某次循环，后面的这一程序不执行
            }
            System.out.print(i);
        }
    }
}
