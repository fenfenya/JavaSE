package com.fenfen.Thread.ThreadState;

import sun.awt.windows.ThemeReader;

//观察测试线程的状态:主线程观测子线程状态，当子线程中重写的run方法执行后，子线程就停止了，主线程跳出循环
public class TestState1 {

    public static void main(String[] args) throws InterruptedException {

        //用lambda重写run方法
        Thread thread = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(i);
            }
            System.out.println("========");

        });


        //观察状态
        Thread.State state = thread.getState();
        System.out.println(state);


        //观察启动后并再次观察状态
        thread.start();
        state = thread.getState();//可以不用每次都创建一个对象了，节约空间来的
        System.out.println(state);

        //
        while (state != Thread.State.TERMINATED){//只要线程不终止，就一直输出状态
            Thread.sleep(100);
            state = thread.getState();//再次更新线程状态
            System.out.println(state);

        }

    }










}
