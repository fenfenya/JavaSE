package com.fenfen.method;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Demo2 {
    public static void main(String[] args) {

        int max = max(12, 12);
        System.out.println(max);
    }


    /*
    方法调用：
    一种是有返回值，方法调用一定是一条语句：int max = max(12, 13);
    一种返回值为void，方法调用一定是一条语句：System.out.print("hello world！);
     */


    //比大小
    public static int max(int num1,int num2){

        int result = 0;

        if(num1==num2){
            System.out.println("num1=num2");
            return 0;//return还可以终止方法
        }

        else if(num1>num2) {
            result = num1;

        }else {
            result = num2;
        }

            return result;//return给他放在外面来,整个result接收，但是记得初始化


    }
}
