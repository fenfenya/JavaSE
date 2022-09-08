package com.fenfen.Thread.Synchronized;

import java.util.ArrayList;
import java.util.List;

//线程不安全的集合：可能出现两个线程同一瞬间操作了同一个位置，把两个数组添加了同一个位置，覆盖的就是少的元素
public class UnsafeList {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < 18000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());//把线程名字添加到集合里面了
            }).start();
        }

        Thread.sleep(3000);
        System.out.println(list.size());
    }
}
