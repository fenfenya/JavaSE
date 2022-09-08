package com.fenfen.method;

public class Practice {
    public static void main(String[] args) {
        int sum = add(2, 3);
        System.out.println(sum);

        int max = max(2, 3);
        System.out.println(max);


    }


    public static int add(int a,int b){
        return a+b;
    }

    public static int max(int num1,int num2){

        int result = 0;

        if(num1 == num2){
            System.out.println("num1=num2");
            return 0;
        }

        if(num1>num2){
            result = num1;

        }else{
            result = num2;
        }

        return result;

    }
}
