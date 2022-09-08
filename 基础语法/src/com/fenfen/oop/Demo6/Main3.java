package com.fenfen.oop.Demo6;

public class Main3 {
    public static void main(String[] args) {
        //类型之间的转化：基本类型转换 高低64 32 16
        //类型之间的转化：父 子

        //父类                子类
        //高                  低
        Person student = new Student();
        //student.go();报错原因：student属于Person，Person中没有go
        //student将这个对象转换未Student类型，我们就可以使用Student类型的方法了：高往低走
        Student student1 = (Student) student;//(Student)student;
        student1.go();
        ((Student)student).go();


        //低                 高
        //子类转换为父类，可能回丢失原来自己的方法
        Student student2 = new Student();
        student2.go();
        //把student变成person类型
        Person person = student2;
        //person.go();就用不了了
    }


    /*
    1、父类引用指向子类对象
    2、把子类转成父类，向上转型，不用强制转换
    3、把父类转换成子类，向上转型，需要强制转换
    4、目的：方便方法的调用，减少重复的代码（不用重新new一个类
     */
}
