package com.fenfen.Thread.Demo1;

//买火车票的例子

//多个线程操作同一个资源的情况下，并发出现问题，线程不安全了，数据紊乱
public class TestThread4 implements Runnable{

    //票数
    private int ticketnums = 10;


    @Override
    public void run() {
        while (true){
            if (ticketnums<=0){
                break;
            }

            //模拟延迟sleep
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"-->拿到了第"+ticketnums--+"票");
        }
    }

    public static void main(String[] args) {
        TestThread4 ticket = new TestThread4();

        new Thread(ticket,"小明").start();
        new Thread(ticket,"小芬").start();
        new Thread(ticket,"黄牛党").start();
    }
}
