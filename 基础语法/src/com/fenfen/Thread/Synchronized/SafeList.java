package com.fenfen.Thread.Synchronized;

import java.util.ArrayList;
import java.util.List;

public class SafeList {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 18000; i++) {//实际输出就17000多
            new Thread(()->{
                synchronized (list) {
                    list.add(Thread.currentThread().getName());//把线程名字添加到集合里面了
                }
            }).start();
        }

        Thread.sleep(3000);
        System.out.println(list.size());
    }
}
