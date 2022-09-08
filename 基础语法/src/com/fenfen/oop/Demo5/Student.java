package com.fenfen.oop.Demo5;

//student子类
public class Student extends Person{

    public Student() {

        System.out.println("子类的无参执行了");
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.say();
        System.out.println(student.money);

        //针对private的封装方法的调用
        student.setMoney2(99);
        System.out.println(student.getMoney2());
    }

    //ctrl+h可以弹出继承树

    private String name = "fenfen子类";

    public void test(String name){
        System.out.println(name);//main传递过来的参数
        System.out.println(this.name);
        System.out.println(super.name);//super去调用父类的

    }


    public void print(){

        System.out.println("Student");
    }


    public void test1(){
        print();//当前方法
        this.print();//当前方法
        super.print();//父类的方法
    }






}
