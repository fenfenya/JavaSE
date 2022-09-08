package com.fenfen.array;

public class ArrayDemo5 {
    public static void main(String[] args) {
        //多维数组：当作四行两列
        /*
        1,2  array[0]
        2,3  array[1]
        3,4  array[2]
        4,5  array[3]
         */
        int[][] array = {{1,2},{2,3},{3,4},{4,5}};


        for (int i = 0; i < array.length; i++) {//外面的数组个数
            for (int j = 0; j < array[i].length; j++) {//里面那一层的数组个数
                System.out.print(array[i][j]);

            }

        }


        System.out.println(array[0]);//输出的是一个对象，也是内存数组

        printArray(array[0]);
        System.out.println("??"+array[0][0]);
        System.out.println(array[0][1]);
        System.out.println(array.length);//输出的是外面的空间:4
        System.out.println(array[0].length);//里面的空间了:2
    }





    //2、打印数组元素（数组做方法传参
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
    }
}
