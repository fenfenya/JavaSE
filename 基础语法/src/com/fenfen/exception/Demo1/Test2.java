package com.fenfen.exception.Demo1;

//快捷生成异常
public class Test2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        //异常快捷键：选中代码：ctrl+alt+t
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            e.printStackTrace();//打印错误的栈信息
        } finally {
        }


    }
}
