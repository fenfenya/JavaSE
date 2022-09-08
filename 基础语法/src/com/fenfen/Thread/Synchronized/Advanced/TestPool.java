package com.fenfen.Thread.Synchronized.Advanced;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//测试线程池
public class TestPool {
    public static void main(String[] args) {
        //1.创建服务，创建线程池
        ExecutorService service = Executors.newFixedThreadPool(10);//参数为池子大小

        service.execute(new MyThread());//启动
        service.execute(new MyThread());//启动
        service.execute(new MyThread());//启动
        service.execute(new MyThread());//启动


        //2、关闭连接
        service.shutdown();
    }

}

class MyThread implements Runnable{
    @Override
    public void run() {
            System.out.println(Thread.currentThread().getName());

    }
}
