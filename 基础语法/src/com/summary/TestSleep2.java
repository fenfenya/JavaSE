package com.summary;

import com.fenfen.Thread.ThreadSleep.TestSleep;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep2{

    public static void main(String[] args) throws InterruptedException {


        while (true){

            Date startTime = new Date(System.currentTimeMillis());;//更新当前时间
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(startTime));//时间格式化工厂

            Thread.sleep(1000);

        }
    }
}
