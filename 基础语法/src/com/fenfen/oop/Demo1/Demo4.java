package com.fenfen.oop.Demo1;

//值传递
public class Demo4 {
    public static void main(String[] args) {
        int a = 1;
        change(a);
        System.out.println(a);//输出仍然是a = 1
    }

    //无返回值
    public static void change(int a){
        //原因：a只是一个形式参数，a=10后没有返回值给到a，于是回到了主方法，主方法中有int a = 1，因此输出就是1了
        a = 10;
    }


    /*
    更加高端的解释：
        ①change方法调用完毕就出栈了，main方法还在栈中
        ②对于基本数据类型来说，给形参传递的是实参值的副本，
            而对于引用数据类型来说，传递则是地址的副本，但由于地址的副本和原来的相似，因此传递过去后的形参也指向同一个内存空间
     */
}
