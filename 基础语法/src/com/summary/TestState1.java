package com.summary;

public class TestState1 {

    public static void main(String[] args) {
        Thread thread  = new Thread(()->{
            for (int i = 0; i < 5; i++) {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("=======");
            }
        });

        Thread.State state = thread.getState();
        System.out.println(state);

        thread.start();
        Thread.State state1 = thread.getState();
        System.out.println(state1);

    }
}
