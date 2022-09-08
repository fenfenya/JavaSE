package com.fenfen.method;

public class Demo5 {
    public static void main(String[] args) {

        printMax(3,31,4,56,7,3);
        printMax(new double[]{1,2,3});
    }

    //找最大值
    public static void printMax(double... numbers){
        if(numbers.length==0){
            System.out.println("No argument passed");
            //return;
        }

        double result = numbers[0];

        for(int i =1;i<numbers.length;i++){
            if(numbers[i]>result){
                result = numbers[i];
            }
        }

        System.out.println(result);

    }

}



