package com.fenfen.exception.Demo1;

//异常类型：StackOverflowError
public class Demo1 {
    public static void main(String[] args) {
        new Demo1().a();
        //会出现StackOverflowError

    }

    public void a(){
        b();

    }

    public void b() {
        a();
    }

}
