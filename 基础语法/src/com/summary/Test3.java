package com.summary;

public class Test3 {
    public static void main(String[] args) {
        Person person = new Person();
        System.out.println(person.name);

        change(person);
        System.out.println(person.name);
    }




    public static void change(Person person){
        person.name = "fenfen";
    }
}

class Person{
    String name;
        }
