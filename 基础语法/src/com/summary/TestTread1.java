package com.summary;

public class TestTread1 extends Thread{
    @Override
    public void run() {
        for (int i = 0;i <20;i++){
            System.out.println("通宵肝代码"+i);
        }
    }

    public static void main(String[] args) {
        TestTread1 testTread1 = new TestTread1();
        testTread1.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("学习多线程"+i);
        }

    }
}
