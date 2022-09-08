package com.fenfen.base;

public class Demo6 {

    public static void main(String[] args) {
    //操作比较大的时候，注意溢出问题
    //JDK新特性，数字可以用下划线分割,且输出没事
        int money = 10_0000_0000;
        System.out.println(money);
        int years = 20;
        int total =money*years;
        System.out.println(total);//-1474836480,溢出了

        //用long写写看也不行，因为转之前是int 20000000000，转换之前已经存在问题了
        long total2 = money*years;
        System.out.println(total2);

        //于是先把years转成long，再计算
        long total3 = money*((long)years);
        System.out.println(total3);

    //注意l和L的，一般用L，l很容易看成1

    }
}
