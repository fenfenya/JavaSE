package com.fenfen.method;

public class Demo3 {
    public static void main(String[] args) {

        //args.length  数组长度  psvm的main方法中是可以传递参数的
        for (int i = 0; i < args.length; i++) {//这个是在遍历参数
            System.out.println("args["+i+"]:"+args[i]);
        }

        //方法的重载：方法名相同，参数类型不同
        double max = max(12, 13);
        System.out.println(max);//把返回值打出来
          }

    public static int max(int num1,int num2){
        int result = 0;

        if(num1==num2){
            System.out.println("两者相等");
            return 0;
        }else if (num1>num2){
            result = num1;
        }else if (num1<num2){
            result = num2;
        }

        return result;
    }


    public static double max(double num1,double num2){
        double result = 0;

        if(num1==num2){
            System.out.println("两者相等");
            return 0;
        }else if (num1>num2){
            result = num1;
        }else if (num1<num2){
            result = num2;
        }

        return result;
    }



}
