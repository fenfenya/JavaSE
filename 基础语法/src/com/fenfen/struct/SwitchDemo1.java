package com.fenfen.struct;

public class SwitchDemo1 {
    public static void main(String[] args) {
        //case 穿透现象  swith 匹配一个值

        char grade = 'A';

        switch(grade){
            case 'A':
                System.out.println("优秀");
                break;//不写break就会把后面的全部输出来，最好都加上
            case 'B':
                System.out.println("良好");
                break;
            case 'C':
                System.out.println("及格");
                break;
            case 'D':
                System.out.println("再接再厉");
                break;
            case 'E':
                System.out.println("没救了");
                break;
            default:
                System.out.println("未知等级");
        }
        /*
        语法：switch(expression){
                case value://记得是冒号！！
                执行语句;
                break;

                case value:
                执行语句;
                break;

                default:
                执行语句;
         */
    }
}
