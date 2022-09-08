package com.fenfen.Thread.ThreadPriority;

//测试线程的优先级：只是意味着获取调度的概率低，并不是优先级高的就一定被最先调用，全看cpu的调度

public class TestPriority {
    public static void main(String[] args) {
        //获取主线程名字以及优先级：默认是5
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());

        MyPriority myPriority = new MyPriority();

        Thread t1 = new Thread(myPriority);
        Thread t2 = new Thread(myPriority);
        Thread t3 = new Thread(myPriority);
        Thread t4 = new Thread(myPriority);
        Thread t5 = new Thread(myPriority);
        Thread t6 = new Thread(myPriority);

        //先设置优先级，再启动，不然启动了再设置没用的
        t1.start();

        t2.setPriority(1);
        t2.start();

        t3.setPriority(4);
        t3.start();

        t4.setPriority(Thread.MAX_PRIORITY);//10
        t4.start();

        //t5.setPriority(-1);
        //t5.start();会报错抛出异常

        //t6.setPriority(11);
        //t6.start();会报错抛出异常
    }
}

class MyPriority implements Runnable{
    @Override
    public void run() {
        //获取子线程名字以及优先级
        System.out.println(Thread.currentThread().getName()+"-->"+Thread.currentThread().getPriority());
    }
}
