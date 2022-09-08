package com.fenfen.Thread.ThreadSleep;

import com.fenfen.Thread.Demo1.TestThread4;

//模拟网络超时:没有sleep会出现只有一个线程拿了票，有了延迟是为了方法问题的发生性：发生线程安全，即多个线程操作了通过同一个对象
public class TestSleep implements Runnable {
    //票数
    private int ticketnums = 10;


    @Override
    public void run() {
        while (true) {
            if (ticketnums <= 0) {
                break;
            }

            //模拟延迟sleep
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "-->拿到了第" + ticketnums-- + "票");
        }
    }

    public static void main(String[] args) {
        TestSleep ticket = new TestSleep();

        new Thread(ticket, "小明").start();
        new Thread(ticket, "小芬").start();
        new Thread(ticket, "黄牛党").start();
    }
}