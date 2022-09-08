package com.fenfen.array;

public class ArraysDemo4 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};

        //1、arrays.for,没有下标，针对数组的for循环
        for (int array : arrays) {
            System.out.println(array);


        }
        //2、数组做方法传参
        printArray(arrays);

        System.out.println("==================");
        //3、反转数组
        int[] reverse = reverse(arrays);
        printArray(reverse);
    }

    //2、打印数组元素（数组做方法传参
    public static void printArray(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            System.out.print(arrays[i]);
        }
    }
    //3、反转数组

        public static int[] reverse(int[] arrays){
            int[] result = new int[arrays.length];

            //反转的操作
            for (int i = 0,j = result.length-1; i <arrays.length ; i++,j--) {
                result[j] = arrays[i];
            }


            return result;

        }



}
