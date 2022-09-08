package com.fenfen.Test;


    public class Test {
        String name;

        public static void main(String[] args) {
            Test test = new Test();
            System.out.println(test.name);

            change(test);
            System.out.println(test.name);
        }



        public static void change(Test test) {
            test.name = "fenfen";
        }
		/*输出结果如下：
		null
		fenfen
		*/

}
