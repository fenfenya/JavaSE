package com.fenfen.Thread.ThreadSleep;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep3 {
    public static void main(String[] args) {

        Date startTime = new Date(System.currentTimeMillis());//获取系统当前时间

        while (true){

            try {
                System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));//时间格式化工厂
                startTime = new Date(System.currentTimeMillis());//更新当前时间
                Thread.sleep(1000);

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
