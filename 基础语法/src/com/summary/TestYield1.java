package com.summary;

public class TestYield1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+ "线程开始执行");
        Thread.yield();//礼让
        System.out.println(Thread.currentThread().getName()+ "线程停止执行");
    }

    public static void main(String[] args) {
        TestYield1 testYield1 = new TestYield1();
        new Thread(testYield1,"a").start();
        new Thread(testYield1,"b").start();
    }
}



