package com.summary;

public class TestThread3 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("我在通宵肝代码---"+i);
        }
    }

    public static void main(String[] args) {
        TestThread3 testThread3 = new TestThread3();
        new Thread(testThread3).start();

        for (int i = 0; i < 20; i++) {
            System.out.println("我在学习多线程---"+i);

        }
    }


}
