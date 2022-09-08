package com.fenfen.oop.Demo7;

//staic静态方法、静态属性
    public class Student {
    //静态属性
    private static int age;//静态的变量
    private double score;//非静态变量

    //静态方法
    public void run(){

    }

    public static void go(){

    }

    public static void main(String[] args) {
        Student student = new Student();

        //用对象输出
        System.out.println(student.score);//student.score.sout
        //用类输出
        System.out.println(Student.age);
        //System.out.println(Student.score);没有static这个就不行
        //直接调用
        System.out.println(age+"kkkkk");

        //方法调用
        //用对象调
        student.run();
        student.go();
        //用类调
        Student.go();
        //Student.run();没有static这个就不行：具体原因，现在是静态方法，只能去调静态方法的
        //直接调
        go();
    }
}
