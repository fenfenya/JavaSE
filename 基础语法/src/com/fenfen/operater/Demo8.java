package com.fenfen.operater;


public class Demo8 {
//三元运算符
public static void main(String[] args) {
    // x ? y :z
    //如果x==true,则结果为y，否则结果为z

    int score = 79;
    String type = score <60 ? "不及格" : "及格";//用type接收一下
    System.out.println(type);


/*
包机制
1、创建包，管理包,本质是文件夹   例如：com.baidu.www
2、查看包 String  ctrl+enter 最上面有包的位置，可以在lang再ctrl+enter一下，最后可以看到包的位置
3、导入包：Date  alt+enter导入包，会生成一句话import java.util.Date,且在packet下面
4、使用别的包中的类 import com.fenfen.base.Demo1；但是会导致现在包中同个名字的类无效，因为已经被引用过了，改个名字就好
    如果想要别的包下所有的类：import com.fenfen.base.*;这个*就很传神，表示所有
 */



}
}
