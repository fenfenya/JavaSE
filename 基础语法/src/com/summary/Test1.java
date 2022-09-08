package com.summary;

import com.fenfen.Thread.Demo1.Race;

import java.util.Scanner;

public class Test1 {


        private int id = 10;
        public void out(){System.out.println("这是外部类的方法");}

        //类内部类；类中类
        public  class Inner{
            public void in(){System.out.println("这是内部类的方法");}

            //获得外部类的私有属性:外部出现的id = 10
            public void getID(){
                System.out.println(id);
            }


            //可以在内部类Inner前加上static：
            // 但是会出现：静态的内部类无法访问非静态的内部属性
        }



}
