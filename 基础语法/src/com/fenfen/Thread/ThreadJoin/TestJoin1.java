package com.fenfen.Thread.ThreadJoin;

//测试join方法
public class TestJoin1 implements Runnable{
    //main到199的时候，让给thread执行了
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程vip已经出现！" + i);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        TestJoin1 testJoin1 = new TestJoin1();
        Thread thread = new Thread(testJoin1);
        thread.start();

        //主线程方法

        for (int i = 0; i < 500; i++) {
            if (i == 200) {
                thread.join();//插队
            }
            System.out.println("main" + i);

        }
    }
}