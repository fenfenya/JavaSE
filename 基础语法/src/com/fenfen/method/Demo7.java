package com.fenfen.method;

public class Demo7 {
    public static void main(String[] args) {
        //或者System.out.println(f(5));

        int a = f(5);
        System.out.println(a);

    }

    //自己调用自己，阶层的例子

    /*递归需要的条件：
    边界条件：边界（最后一个就会执行到底
    前阶段：一直调用的时候
    返回阶段n*n-1

    栈机制：压了好几个栈  要考虑内存的情况
    学的是递归思想：一层一层的往下解决
     */
    public static int f(int n){
        if(n==1){
            return 1;
        }else {
            return n*f(n-1);
        }

    }
}
