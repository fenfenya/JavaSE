package com.fenfen.Thread.Demo1;

//创建线程方式：继承Thread类，重写run()方法，调用start开启线程
public class TestThread1 extends Thread{

    @Override
    public void run() {
        //run 方法线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("我在通宵肝代码---"+i);
            
        }
    }
    public static void main(String[] args) {
        //main方法，主线程

        //创建一个线程对象，并调用start方法
        TestThread1 testTread1 = new TestThread1();
        testTread1.start();
        //如果是run方法就是正常的先跑run方法上面的
        testTread1.run();


        for (int i = 0; i < 200; i++) {
            System.out.println("我在学习多线程---"+i);
            
        }
        /*
        输出结果是交替执行的,由cpu调度执行
         */
    }

}
