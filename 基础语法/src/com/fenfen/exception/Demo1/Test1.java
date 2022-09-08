package com.fenfen.exception.Demo1;

//捕获异常
public class Test1{
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        try {
            //try 监控区域

            //用if主动抛出异常
            if(b==0){
                throw new ArithmeticException();
            }
            new Test1().a();
        }catch(Error e) {//想要捕获的异常类型,可以写多个:从小到大
            System.out.println("Error");
        }catch(Exception e) {
            System.out.println("Exception");
        }catch(Throwable e) {
            System.out.println("Throwable");
        } finally {//处理善后工作
            System.out.println("finally");
        }
    }

    //写两个方法互相调用
    public void a(){
        b();
    }
    public void b(){
        a();
    }

}
