package com.fenfen.base;

public class Demo3 {
    public static void main(String[] args) {
        //整数拓展 ：进制 十进制 二进制0b 八进制0 十六进制0x

        int i = 10;//正常十进制
        int i1 = 0b1;//表示二进制
        int i2 = 010;//表示八进制：表示8
        int i3 = 0x11;//十六进制：表示17

        System.out.println(i);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);

        //浮点拓展 银行业务怎么表示？：用类BigDecimal数学工具类
        float f = 0.1F;//0.1
        double d = 1.0 / 10;//0.1
        //不相等原因：float 有限 离散 含舍入误差  大约：接近但不等于
        //最好完全避免使用浮点数比较
        //最好完全避免使用浮点数比较
        //最好完全避免使用浮点数比较
        System.out.println(f == d);//false
        System.out.println(f);
        System.out.println(d);


        float d1 = 23232323;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);//true


        //字符拓展:把字符强制转换成数字后，会发现输出了数字，所有的字符本质还是数字，Unicode 2字节  65536最多
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int) c1);//强制转换类型(int)
        System.out.println(c2);


        char c3 = '\u0061';
        System.out.println(c3);//a

        //转义字符：
        //\t制表符
        //\n换行
        System.out.println("Hello\tWorld");

        //从内存分析是否相等
        String sa = new String("hello world");
        String sb = new String("hello world");
        System.out.println(sa == sb);//不相等

        String sc = "hello world";
        String sd = "hello world";
        System.out.println(sc == sd);//相等

        //布尔值拓展
        boolean flag = true;
        //一般用在if判断会多一点
        if (flag == true) {}
        if (flag) {}//一个意思
    }


}