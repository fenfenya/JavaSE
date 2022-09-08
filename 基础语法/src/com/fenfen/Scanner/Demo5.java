package com.fenfen.Scanner;

import java.util.Scanner;

public class Demo5 {
    //我们可以输入多个数字，并求其总和和平均数，没输入一个数字用回车确认，通过输入非数字来结束输入并输出执行结果
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //和
        double sum = 0;
        //计算输入了多少个数字
        int m = 0;

        System.out.println("请输入数字：");
        //通过循环判断是否还有输入，并在里面对每一个进行求和和统计
        while (scanner.hasNextDouble()==true){
            double x = scanner.nextDouble();
            m = m +1 ;//或者写m++
            sum =sum + x;//或者写sum+ = x
            System.out.println("你输入了第"+m+"个数据，然后当前的结果为"+sum);
        }

        System.out.println(m+"个数的和为"+sum);
        System.out.println(m+"个数的平均值是"+(sum/m));

        scanner.close();
    }

    /*总结：
    ①while循环用起来
    ②初始定义，然后累计加总
     */
}
