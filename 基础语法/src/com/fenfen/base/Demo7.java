package com.fenfen.base;

public class Demo7 {

    //实例变量：在类里面，main方法外面，从属于对象(或者类),不用初始化,不初始化就是默认值 0 0.0  null false
    String name;
    int age;

    //类变量：跟实例变量位置一样static，从属于类，会随类出现或者消失
    static double salary = 2500;




    //类里面有main方法，还有一些属性，可以理解为就是变量
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        String name = "fenfen";
        char x = 'X';
        double pi = 3.14;


        //局部变量；必须声明和初始化值(赋值),只在这个方法或者代码块的的括号中有用
        int i = 9;
        System.out.println(i);


        //实例变量用法：变量名字 = new Demo8();
        Demo7 demo7 = new Demo7();//new com.fenfen.base.Demo7().var;
        System.out.println(demo7.age);//demo7.age.sout;
        System.out.println(demo7.name);//demo7.name.sout'

        //类变量用法:没有static就报错
        System.out.println(salary);



    }

    //其他方法
    public void add(){

        }


    /*规则
    类成员变量：首字母小写和驼峰原则：除了第一个单词以外，后面的单词首字母都大写lastPrimaryName
    常量：大写都
    类名：首字母大写和驼峰原则
    方法名：首字母小写和驼峰规则
     */


}
