package com.fenfen.struct;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String name = "fenfen";
        //jdk7才支持的新特征，表达式结果可以是字符串

        //反编译  java--class（字节码文件
        switch (name){
            case "yueyue":
                System.out.println("yueyue");
                break;
            case"fenfen":
                System.out.println("fenfen");
                break;
            default:
                System.out.println("做咩啊");

        }
        /*反编译操作方式：
        把out里面的class文件利用idea复制到src里面就是可以看到反编译的文件了，后缀是class
         发现switch中反编译后：switch是通过hashCode()和equals去查找中文对应的哈希值看下匹不匹配
         */
    }
}
