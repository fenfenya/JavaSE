package com.fenfen.Thread.Synchronized.Advanced;

import java.util.concurrent.CopyOnWriteArrayList;//并发包下的

//测试JUC安全类型的集合:人家写好的类本来就是安全的，我们不需要再去同步了
public class TestJUC {
    public static void main(String[] args) throws InterruptedException {
        CopyOnWriteArrayList<String > list = new CopyOnWriteArrayList<String>();

        for (int i = 0; i < 10000; i++) {
            new Thread(()->{
                list.add(Thread.currentThread().getName());
                    }).start();
        }
        Thread.sleep(3000);

        System.out.println(list.size());
    }
}
