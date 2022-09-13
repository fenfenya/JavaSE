package com.summary;

public class TestThread4 implements Runnable{


    private int ticketnums = 10;

    @Override
    public void run() {

        while (true){


            if(ticketnums<=0){
                break;
            }

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println(Thread.currentThread().getName() +ticketnums--+"票");


        }

    }

    public static void main(String[] args) {
        TestThread4 ticket = new TestThread4();
        new Thread(ticket,"小明").start();
        new Thread(ticket,"小芬").start();
        new Thread(ticket,"黄牛党").start();
    }
}
