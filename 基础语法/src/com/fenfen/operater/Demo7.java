package com.fenfen.operater;

//拓展赋值运算符
public class Demo7 {
    public static void main(String[] args) {
        int a = 9;
        int b = 19;

        a+=b;//a = a + b
        a-=b;//a = a - b
        System.out.println(a);

        //字符串连接符
        System.out.println(a+b);
        System.out.println(""+a+b);//一起变成String类型了
        System.out.println(+a+b+"");//前面依据计算，后面拼字符串
    }
}
