package com.fenfen.Thread.ThreadYield;

//测试礼让线程，礼让也
public class TestYield1 {
    public static void main(String[] args) {
        MyYield myYield = new MyYield();

        new Thread(myYield,"a").start();
        new Thread(myYield,"b").start();
    }


}


class MyYield implements Runnable{//alt+回车导入run方法
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "线程开始执行");
        Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+ "线程停止执行");
    }

}
