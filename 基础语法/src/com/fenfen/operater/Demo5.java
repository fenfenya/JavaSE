package com.fenfen.operater;
//逻辑运算符
public class Demo5 {
    public static void main(String[] args) {
        //与，或，非
        boolean a = true;
        boolean b =false;
        System.out.println("a && b:"+(a && b));//逻辑与：两个变量都为真，才是真，如果左边为假，直接结束运算
        System.out.println("a || b:"+(a || b));//逻辑或：两个变量都为假，才为假，如果左边为真，直接结束运算
        System.out.println("!(a && b):"+!(a&&b));//与取非

        //短路运算
        int c = 5;
        boolean d = (c<4)&&(c++<4);//前面是错的，后面就不执行了，所以c还是5
        System.out.println(d);
        System.out.println(c);
    }
}
