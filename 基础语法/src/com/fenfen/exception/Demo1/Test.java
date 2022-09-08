package com.fenfen.exception.Demo1;

//捕获异常
public class Test {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        try {
            //try 监控区域
            if(b==0){
                throw new ArithmeticException();
            }
            System.out.println(a/b);
        }catch(ArithmeticException e){//捕获异常
            System.out.println("程序出现异常，变量b不能为0");
        }finally {//处理善后工作
            System.out.println("finally");
        }
        /*
        finally可以不要，finally一般用在io流的关闭
         */
    }
}
