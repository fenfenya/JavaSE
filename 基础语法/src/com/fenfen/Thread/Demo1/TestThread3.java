package com.fenfen.Thread.Demo1;

//创建线程方式2：实现Runnable接口，重写run方法，执行线程需要丢入Runnable接口实现类，调用start方法
public class TestThread3 implements Runnable{
    @Override
    public void run() {
        //run 方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在通宵肝代码---"+i);

        }
    }
    public static void main(String[] args) {
        //main方法，主线程

        //创建Runnable接口实现类对象，并调用start方法
        TestThread3 testTread3 = new TestThread3();

        //创建线程对象，通过线程对象来开启我们的线程，代理
        Thread thread = new Thread(testTread3);
        thread.start();
        //new Thread(testTread3).start();或者直接一句这个


        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程---"+i);

        }
        /*
        1、去看源码发现，本质是因为：Thread也实现了Runnable接口，Runnable就一个run方法在里卖弄
        2、继承是单继承，推荐使用Runnable方法
         */
    }
}
