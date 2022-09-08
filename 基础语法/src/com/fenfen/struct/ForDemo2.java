package com.fenfen.struct;

public class ForDemo2 {
    public static void main(String[] args) {
        //练习1:计算0到100之间的奇数和偶数的和
        int oddSum = 0;//定义奇数的和
        int evenSum = 0;//定义偶数的和

        for (int i = 0; i <= 100; i++) {
            if(i%2!=0){//用模运算
                oddSum+=i;
            }else{
                evenSum+=i;
            }
        }
        System.out.println("奇数的和："+oddSum);
        System.out.println("偶数的和："+evenSum);
    }
}
