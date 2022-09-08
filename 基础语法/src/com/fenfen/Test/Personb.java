package com.fenfen.Test;

public class Personb {

    protected String name = "fenfen父类";

    public void print(){
        System.out.println("personb");
    }

    public Personb(){
        System.out.println("父类无参构造器执行");
    }

    public Personb(String name) {
        System.out.println("父类有参构造器执行");
    }
}


class Student extends Personb{
    private String name = "fenfen子类";


    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }

    public void print(){
        System.out.println("Student");
    }

    public void test1(){
        print();
        this.print();
        super.print();
    }

    public Student(){
        System.out.println("子类的无参构造器执行了");
    }

    public Student(String name) {
        super("我好");
        System.out.println("子类的有参构造器执行了");
    }
}


class Applicationb{
    public static void main(String[] args) {
        Student student = new Student("你好");
        //student.test("fenfen的main方法");

        //student.test1();



    }
}

