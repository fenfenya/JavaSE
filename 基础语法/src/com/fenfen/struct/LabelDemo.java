package com.fenfen.struct;

public class LabelDemo {
    public static void main(String[] args) {
        //打印101-150之间所有的质数
        int count = 0;

        outer:for(int i = 101;i<150;i++){   //outer是标签
            for(int j = 2;j<i/2;j++){
                if(i%j==0){
                    continue outer;//返回到标签的位置，可以跳到指定循环处，不一定就跳出这个循环而已
                }
            }
            System.out.print(i+" ");
        }
    }
}
