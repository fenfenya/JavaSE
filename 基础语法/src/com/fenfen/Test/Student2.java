package com.fenfen.Test;

public class Student2 {
    private String name;
    private int id;
    private char sex;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class Application1{
    public static void main(String[] args) {
        Student2 student2 = new Student2();
        student2.setName("yueyue");
        System.out.println(student2.getName());
    }


}
